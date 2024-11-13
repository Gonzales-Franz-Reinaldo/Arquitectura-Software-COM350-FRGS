var verifyToken = require('./VerifyToken');
var express = require('express');
var router = express.Router();
var bodyParser = require('body-parser');

router.use(bodyParser.urlencoded({ extended: true }));
router.use(bodyParser.json());

var User = require('../user/User');

var jwt = require('jsonwebtoken');
var bcrypt = require('bcryptjs');



// Crear usuario
router.post('/', (req, res) => {

    var hashedPassword = bcrypt.hashSync(req.body.password, 8);
    console.log(req.body.email);

    User.findOne({"email": req.body.email})
        .then(user => {
            if(user){
                console.log("El usuario ya existe: ", user);
                return res.status(500).send({message: "El usuario ya existe"});
            } else {

                const newUser = new User({
                    name: req.body.name,
                    email: req.body.email,
                    password: hashedPassword,
                    rol: req.body.rol,
                    dateCreate: new Date(),
                    state: "Activo"
                });

                newUser.save();

                res.status(200).send(newUser);
            }
        });
});


// Listar todos los usuarios
router.get('/', verifyToken, (req, res) => {
    User.find().exec()
        .then(users => {
            res.status(200).send(users);
        })
        .catch(err => {
            res.status(500).send({message: err});
        });

});


// Obtener un usado 
router.get('/:id', verifyToken, (req, res) => {
    console.log(req.params.id);
    
    User.findById(req.params.id).exec()
        .then(user => {
            console.log(user);
            
            if(!user){
                return res.status(404).send({message: "Usuario no encontrado"});
            }
            res.status(200).send(user);
        })
        .catch(err => {
            return res.status(500).send({message: err});
        });
});


// Actualizar un usuario
router.put('/:id', verifyToken, (req, res) => {
    console.log(req.params.id);
    console.log(req.body);

    User.findByIdAndUpdate(req.params.id, req.body, {new: true}).exec()
        .then(user => {
            if(!user){
                return res.status(404).send({message: "Usuario no encontrado"});
            }
            res.status(200).send(user);
        })
        .catch(err => {
            return res.status(500).send({message: err});
        });
});

// Eliminar un usuario
router.delete('/:id', verifyToken, (req, res) => {
    console.log("Inactivo");

    User.findByIdAndUpdate(req.params.id, {state: "Inactivo"}, {new: true}).exec()
        .then(user => {
            if(!user){
                return res.status(404).send({message: "Usuario no encontrado"});
            }
            res.status(200).send(user);
        })
        .catch(err => {
            return res.status(500).send({message: err});
        });
});


// Add the middleware to the router
router.use(function (user, req, res, next) {
    res.status(200).send(user);
});

module.exports = router;