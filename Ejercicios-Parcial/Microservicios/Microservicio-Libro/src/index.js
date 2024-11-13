require('dotenv').config();
const express = require('express');
const app = express();
const libroRoutes = require('./app/routes/libroRoutes');

//settings
app.set('port', process.env.PORT || 3005);


//middlewares
app.use(express.json());

// routes
app.use('/api', libroRoutes);

// starting the server
app.listen(app.get('port'), () => {
    console.log('El servidor está corriendo en el puerto:', app.get('port'));
});