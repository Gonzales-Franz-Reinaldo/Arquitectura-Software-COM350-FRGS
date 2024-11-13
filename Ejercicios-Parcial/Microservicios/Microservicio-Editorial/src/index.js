require('dotenv').config();
const app = require('./config/server');
const winston = require('winston');
var Connection = require('./config/dbConnection').pool;

require('./routes/controller')(app);

// starting the server
app.listen(app.get('port'), () => {
    console.log('El servidor está corriendo en el puerto:', app.get('port'));
});