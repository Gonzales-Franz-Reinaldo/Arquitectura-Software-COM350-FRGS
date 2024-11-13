require('dotenv').config();
const path = require('path');
const express = require('express');
const bodyParser = require('body-parser');


const app = express();

// settings
app.set('port', process.env.PORT || 3002);
app.set('view engine', 'ejs');

app.use(express.json());
app.use(bodyParser.urlencoded({ extended: false }));

module.exports = app;