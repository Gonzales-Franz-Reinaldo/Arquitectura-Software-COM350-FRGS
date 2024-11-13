var VerifyToken = require('./VerifyToken');
var express = require('express');
var router = express.Router();
var bodyParser = require('body-parser');

router.use(bodyParser.urlencoded({ extended: true }));
router.use(bodyParser.json());

var User = require('../user/User');

var jwt = require('jsonwebtoken');
var bcrypt = require('bcryptjs');
var config = require('../config/config');


// Login
router.post('/', (req, res) => {

    User.findOne({ email: req.body.email }).exec()
        .then(user => {
            if (!user) return res.status(404).send({ message: 'El usuario no existe' });
        
            var passwordIsValid = bcrypt.compareSync(req.body.password, user.password);
            
            if (!passwordIsValid) return res.status(401).send({ auth: false, token: null });
            
            console.log('JWT_SECRET:', config.secret);
            console.log('JWT_ALGORITHM:', 'HS256'); 

            var token = jwt.sign(
                { 
                    id: user._id,
                    name: user.name,
                    email: user.email,
                    rol: user.rol 

                }, config.secret, {
                    expiresIn: 86400, 
                    algorithm: 'HS256'    
                }
            );

            res.status(200).send({ auth: true, token: token });
            console.log('Generated Token:', token);

        })
        .catch(err => {
            res.status(500).send({ message: err });
        });
});




router.get('/', VerifyToken, (req, res, next) => {

    User.findById(req.userId, { password: 0 }, (err, user) => {
        if (err) return res.status(500).send('Hubo un problema al buscar el usuario.');
        if (!user) return res.status(404).send('No se encontro el usuario.');

        res.status(200).send(user);
    });
});



router.use( (user, req, res, next) => {
    res.status(200).send(user);
});


module.exports = router;