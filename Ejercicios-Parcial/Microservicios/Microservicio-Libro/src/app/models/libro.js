const dbConnection = require('../../config/dbConnection').pool;

let libroModel = {};


// id
// titulo
// editorial_id
// edicion
// pais
// precio

// Para obtener todos los libros
libroModel.getLibros = (callback) => {
    dbConnection.getConnection((err, connection) => {
        if (err) {
            console.error('Error al obtener la conexión:', err);
            return callback(err, null);
        }

        var sql = 'SELECT * FROM libros';
        connection.query(sql, (err, result) => {
            if (err) {
                console.error('Error al realizar la consulta:', err);
                return callback(err, null);
            }
            connection.release();
            callback(null, result);
        });
    });
}


// Para crear un libro
libroModel.insertLibro = (libroData, callback) => {
    dbConnection.getConnection((err, connection) => {
        if (err) {
            console.error('Error al obtener la conexión:', err);
            return callback(err, null);
        }

        var sql = 'INSERT INTO libros SET ?';
        connection.query(sql, libroData, (err, result) => {
            if (err) {
                console.error('Error al realizar la consulta:', err);
                return callback(err, null);
            }
            connection.release();
            callback(null, result);
        });
    });
}


// Para obtener un libro por su id
libroModel.getLibroId = (id, callback) => {
    dbConnection.getConnection((err, connection) => {
        if (err) {
            console.error('Error al obtener la conexión:', err);
            return callback(err, null);
        }

        var sql = 'SELECT * FROM libros WHERE id = ?';
        connection.query(sql, [id], (err, result) => {
            if (err) {
                console.error('Error al realizar la consulta:', err);
                return callback(err, null);
            }
            connection.release();
            callback(null, result);
        });
    });
}


// Para actualizar un libro por su id
libroModel.updateLibro = (id, libroData, callback) => {
    dbConnection.getConnection((err, connection) => {
        if (err) {
            console.error('Error al obtener la conexión:', err);
            return callback(err, null);
        }

        var sql = 'UPDATE libros SET ? WHERE id = ?';
        connection.query(sql, [libroData, id], (err, result) => {
            if (err) {
                console.error('Error al realizar la consulta:', err);
                return callback(err, null);
            }
            connection.release();
            callback(null, result);
        });
    });
}


// Para eliminar un libro por su id
libroModel.deleteLibro = (id, callback) => {
    dbConnection.getConnection((err, connection) => {
        if (err) {
            console.error('Error al obtener la conexión:', err);
            return callback(err, null);
        }

        var sql = 'DELETE FROM libros WHERE id = ?';
        connection.query(sql, [id], (err, result) => {
            if (err) {
                console.error('Error al realizar la consulta:', err);
                return callback(err, null);
            }
            connection.release();
            callback(null, result);
        });
    });
}

// Para search un libro por su atributos
libroModel.searchLibro = (libroData, callback) => {
    dbConnection.getConnection((err, connection) => {
        if (err) {
            console.error('Error al obtener la conexión:', err);
            return callback(err, null);
        }

        var sql = 'SELECT * FROM libros WHERE ?';
        connection.query(sql, libroData, (err, result) => {
            if (err) {
                console.error('Error al realizar la consulta:', err);
                return callback(err, null);
            }
            connection.release();
            callback(null, result);
        });
    });
}

module.exports = libroModel;