/*
CRUD Libros
*/
const express = require('express');
const router = express.Router();
const Libro = require('../models/libro');
const VerifyToken = require('./VerifyToken');

// Obtener todos los libros
router.get('/libros', VerifyToken, async (req, res) => {
    try {
        const libros = await new Promise((resolve, reject) => {
            Libro.getLibros((err, result) => {
                if (err) reject(err);
                else resolve(result);
            });
        });
        res.json(libros);
    } catch (error) {
        res.status(500).json({ message: 'Error al obtener los libros' });
    }
});

// Crear un nuevo libro
router.post('/libros', VerifyToken, async (req, res) => {
    try {
        const libroData = {
            id: null,
            titulo: req.body.titulo,
            editorial_id: req.body.editorial_id,
            edicion: req.body.edicion,
            pais: req.body.pais,
            precio: req.body.precio,
        };
        
        const result = await new Promise((resolve, reject) => {
            Libro.insertLibro(libroData, (err, result) => {
                if (err) reject(err);
                else resolve(result);
            });
        });

        // Buscar el libro recién insertado para devolverlo como respuesta
        const nuevoLibro = await new Promise((resolve, reject) => {
            Libro.getLibroId(result.insertId, (err, libro) => {
                if (err) reject(err);
                else resolve(libro[0]);
            });
        });
        
        res.status(201).json(nuevoLibro);
    } catch (error) {
        res.status(500).json({ message: 'Error al crear el libro' });
    }
});

// Obtener un libro por su ID
router.get('/libros/:id', VerifyToken, async (req, res) => {
    try {
        const libro = await new Promise((resolve, reject) => {
            Libro.getLibroId(req.params.id, (err, result) => {
                if (err) reject(err);
                else resolve(result[0]);
            });
        });

        if (libro) {
            res.json(libro);
        } else {
            res.status(404).json({ message: 'Libro no encontrado' });
        }
    } catch (error) {
        res.status(500).json({ message: 'Error al obtener el libro' });
    }
});

// Actualizar un libro por su ID
router.put('/libros/:id', VerifyToken, async (req, res) => {
    try {
        const libroData = {
            titulo: req.body.titulo,
            editorial_id: req.body.editorial_id,
            edicion: req.body.edicion,
            pais: req.body.pais,
            precio: req.body.precio,
        };

        const result = await new Promise((resolve, reject) => {
            Libro.updateLibro(req.params.id, libroData, (err, result) => {
                if (err) reject(err);
                else resolve(result);
            });
        });

        if (result.affectedRows === 0) {
            return res.status(404).json({ message: 'Libro no encontrado' });
        }

        // Obtener el libro actualizado para devolverlo como respuesta
        const libroActualizado = await new Promise((resolve, reject) => {
            Libro.getLibroId(req.params.id, (err, result) => {
                if (err) reject(err);
                else resolve(result[0]);
            });
        });

        res.json(libroActualizado);
    } catch (error) {
        res.status(500).json({ message: 'Error al actualizar el libro' });
    }
});

// Eliminar un libro por su ID
router.delete('/libros/:id', VerifyToken, async (req, res) => {
    try {
        const result = await new Promise((resolve, reject) => {
            Libro.deleteLibro(req.params.id, (err, result) => {
                if (err) reject(err);
                else resolve(result);
            });
        });

        if (result.affectedRows === 0) {
            return res.status(404).json({ message: 'Libro no encontrado' });
        }

        res.json({ message: 'Libro eliminado con éxito' });
    } catch (error) {
        res.status(500).json({ message: 'Error al eliminar el libro' });
    }
});

// Buscar libros por filtros
router.get('/libros/search', VerifyToken, async (req, res) => {
    const { titulo, editorial_id, edicion, pais, precio } = req.query;
    const libroData = {
        titulo: titulo || null,
        editorial_id: editorial_id || null,
        edicion: edicion || null,
        pais: pais || null,
        precio: precio || null,
    };

    try {
        const libros = await new Promise((resolve, reject) => {
            Libro.searchLibro(libroData, (err, result) => {
                if (err) reject(err);
                else resolve(result);
            });
        });
        res.json(libros);
    } catch (error) {
        res.status(500).json({ message: 'Error al buscar los libros' });
    }
});

module.exports = router;
