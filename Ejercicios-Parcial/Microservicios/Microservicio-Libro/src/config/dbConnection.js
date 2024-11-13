const mysql = require('mysql');

var pool = mysql.createPool({
    host: "localhost",
    user: "root",
    password: "",
    database: "bd_gestion_libreria"
});

pool.getConnection((err, connection) => {
    if (err) {
        console.error('Error al conectar a la base de datos:', err);
    } else {
        console.log('Conexión a la BD exitosa.');
        connection.release();
    }
});

exports.pool = pool;