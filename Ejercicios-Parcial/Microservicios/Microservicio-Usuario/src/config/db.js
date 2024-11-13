const mongoose = require('mongoose');

const dbConnection = process.env.DB_CONNECTION_STRING || 'mongodb://127.0.0.1:27017/bd_users';

mongoose.connect(dbConnection)
    .then(() => console.log('Conexión a la base de datos MongoDB.'))
    .catch(err => console.log('Error al conectar a la base de datos MongoDB.', err));