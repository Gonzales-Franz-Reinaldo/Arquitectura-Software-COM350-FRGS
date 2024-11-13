var jwt = require('jsonwebtoken');
var config = require('../config/config');

function verifyToken(req, res, next) {
    // Obtiene el token de la cabecera de la solicitud
    var token = req.headers['authorization'];

    if (!token)
        return res.status(403).send({ auth: false, message: 'No token provided.' });

    // Elimina "Bearer " si está presente
    if (token.startsWith('Bearer ')) {
        token = token.slice(7, token.length);
    }

    jwt.verify(token, config.secret, (err, decoded) => {
        if (err)
            return res.status(500).send({ auth: false, message: 'Fail to Authentication token.' + err });

        // Validación de permisos basada en el rol
        const userRole = decoded.rol;

        // Restricción para métodos GET, POST, PUT y DELETE
        if ((req.route.methods.get || req.route.methods.post || req.route.methods.put || req.route.methods.delete) && userRole !== 'admin') {
            return res.status(401).send({ auth: false, message: 'No tienes permisos para acceder a esta ruta.' });
        }

        // Añade los datos decodificados al objeto de solicitud
        req.userId = decoded.id;
        req.isAdmin = decoded.isAdmin;
        req.rol = decoded.rol;  
        next();

    });
}

module.exports = verifyToken;
