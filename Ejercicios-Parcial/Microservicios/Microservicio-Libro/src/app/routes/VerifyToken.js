
var jwt = require('jsonwebtoken');
var config = require('../../config/config');

function verifyToken(req, res, next) {
    var token = req.headers['authorization'];
    if (!token)
        return res.status(403).send({ auth: false, message: 'No token provided.' });

    if (token.startsWith('Bearer ')) {
        token = token.slice(7, token.length);
    }

    jwt.verify(token, config.secret, (err, decoded) => {
        if (err)
            return res.status(500).send({ auth: false, message: 'Fail to Authentication token.' + err });

        req.userId = decoded.id;
        req.isAdmin = decoded.isAdmin;
        req.rol = decoded.rol;
        next();
    });
}


module.exports = verifyToken;
