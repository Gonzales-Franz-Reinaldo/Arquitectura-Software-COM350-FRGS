var verifyToken = require('./VerifyToken');
var dbConnection = require('../config/dbConnection').pool;

module.exports = app => {

    app.use((item, err, req, res, next) => {
        console.log(item);
        res.status(200).send(item);
    });

    // Para obtener todas las editoriales
    app.get('/api/editorial', verifyToken, (req, res) => {
        console.log('GET /api/editorial');
        var sql = 'SELECT * FROM editoriales';
        dbConnection.getConnection((err, connection) => {
            if (err) {
                console.error('Error al obtener la conexión:', err);
                return res.status(500).send({ message: 'Error al obtener la conexión' });
            }
            connection.query(sql, (err, result) => {
                if (err) {
                    console.error('Error al realizar la consulta:', err);
                    return res.status(500).send({ message: 'Error al realizar la consulta' });
                }
                res.status(200).send(result);
                console.log(result);
                connection.release();
            });
        });
    });

    // Para obtener una editorial por su id
    app.get('/api/editorial/:id', verifyToken, (req, res) => {
        console.log('GET /api/editorial/:id');
        var id = req.params.id;
        var sql = 'SELECT * FROM editoriales WHERE id = ?';
        dbConnection.getConnection((err, connection) => {
            if (err) {
                console.error('Error al obtener la conexión:', err);
                return res.status(500).send({ message: 'Error al obtener la conexión' });
            }
            connection.query(sql, [id], (err, result) => {
                if (err) {
                    console.error('Error al realizar la consulta:', err);
                    return res.status(500).send({ message: 'Error al realizar la consulta' });
                }
                res.status(200).send(result);
                console.log(result);
                connection.release();
            });
        });
    });

    // Para crear una editorial 
    app.post('/api/editorial', verifyToken, (req, res) => {
        console.log('POST /api/editorial');
        console.log(req.body);
        var sql = 'INSERT INTO editoriales SET ?';
        var editorial = req.body;
        dbConnection.getConnection((err, connection) => {
            if (err) {
                console.error('Error al obtener la conexión:', err);
                return res.status(500).send({ message: 'Error al obtener la conexión' });
            }
            connection.query(sql, editorial, (err, result) => {
                if (err) {
                    console.error('Error al realizar la consulta:', err);
                    return res.status(500).send({ message: 'Error al realizar la consulta' });
                }
                res.status(200).send({ message: 'Editorial creada con éxito' });
                console.log(result);
                connection.release();
            });
        });
    });

    // Para actualizar una editorial
    app.put('/api/editorial/:id', verifyToken, (req, res) => {
        console.log('PUT /api/editorial/:id');
        console.log(req.body);
        var id = req.params.id;
        var editorial = req.body;
        var sqlUpdate = 'UPDATE editoriales SET ? WHERE id = ?';
    
        dbConnection.getConnection((err, connection) => {
            if (err) {
                console.error('Error al obtener la conexión:', err);
                return res.status(500).send({ message: 'Error al obtener la conexión' });
            }
    
            // Actualiza la editorial
            connection.query(sqlUpdate, [editorial, id], (err, result) => {
                if (err) {
                    console.error('Error al realizar la consulta:', err);
                    return res.status(500).send({ message: 'Error al realizar la consulta' });
                }
    
                // Verifica si se actualizó alguna fila
                if (result.affectedRows === 0) {
                    return res.status(404).send({ message: 'Editorial no encontrada' });
                }
    
                // Obtén el objeto actualizado
                var sqlSelect = 'SELECT * FROM editoriales WHERE id = ?';
                connection.query(sqlSelect, [id], (err, rows) => {
                    connection.release(); // Libera la conexión
    
                    if (err) {
                        console.error('Error al realizar la consulta de selección:', err);
                        return res.status(500).send({ message: 'Error al realizar la consulta de selección' });
                    }
    
                    // Envía el objeto actualizado como respuesta en formato JSON
                    res.status(200).send(rows[0]);
                });
            });
        });
    });
    

    // Para eliminar una editorial
    app.delete('/api/editorial/:id', verifyToken, (req, res) => {
        console.log('DELETE /api/editorial/:id');
        console.log(req.body);
        var id = req.params.id;
        var sql = 'DELETE FROM editoriales WHERE id = ?';
        dbConnection.getConnection((err, connection) => {
            if (err) {
                console.error('Error al obtener la conexión:', err);
                return res.status(500).send({ message: 'Error al obtener la conexión' });
            }
            connection.query(sql, id, (err, result) => {
                if (err) {
                    console.error('Error al realizar la consulta:', err);
                    return res.status(500).send({ message: 'Error al realizar la consulta' });
                }
                res.status(200).send({ message: 'Editorial eliminada con éxito' });
                // console.log(result);
                connection.release();
            });
        });
    });

    // Para hacer un PATCH a una editorial
    app.patch('/api/editorial/:id', verifyToken, (req, res) => {
        console.log('PATCH /api/editorial/:id');
        console.log(req.body);
        var id = req.params.id;
        var editorial = req.body;
        var sql = 'UPDATE editoriales SET ? WHERE id = ?';
        dbConnection.getConnection((err, connection) => {
            if (err) {
                console.error('Error al obtener la conexión:', err);
                return res.status(500).send({ message: 'Error al obtener la conexión' });
            }
            connection.query(sql, [editorial, id], (err, result) => {
                if (err) {
                    console.error('Error al realizar la consulta:', err);
                    return res.status(500).send({ message: 'Error al realizar la consulta' });
                }
                res.status(200).send({ message: 'Editorial actualizada con éxito' });
                // console.log(result);
                connection.release();
            });
        });
    });
}