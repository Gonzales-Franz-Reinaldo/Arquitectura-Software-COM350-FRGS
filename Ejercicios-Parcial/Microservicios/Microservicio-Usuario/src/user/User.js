var mongoose = require('mongoose');

var validateEmail = (email) => {
    var re = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    return re.test(email);
};


var userSchema = new mongoose.Schema({
    name: {
        type: String,
        required: 'Name is required',
        minlength: 5,
        maxlength: 50
    },
    email:{
        type: String,
        unique: true,
        required: 'Email is required',
        validate: [validateEmail, 'Please fill a valid email address'],
        match: [/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/, 'Please fill a valid email address']
    },
    password: {
        type: String,
        required: 'Password is required',
        minlength: 5,
        maxlength: 100
    },

    rol: {
        type: String,
        enum: ['estudiante', 'admin'],
        default: 'User'
    },
    dateCreate: String,
    state: {
        type: String,
        enum: ['Activo', 'Inactivo']
    }
}, { timestamps: true });

mongoose.model('User', userSchema);

module.exports = mongoose.model('User');