# Instalar 

# Instalar microservicio usuarios
clonar el repositrio microservicios

# ir a la carpeta serviceUsersnode 16.16.0
cd serviceUsers

# Intalar
- npm -y init
- npm install

# instalar golebalmente nodemon
npm install -g nodemon 

# instalar las librerias
npm install

# Installar express
npm install express

# Instalar mongoose
npm install mongoose

# Instalar npm install jsonwebtoken
npm install jsonwebtoken

# Instalar npm install bcrypt
- npm install bcrypt
- npm install bcryptjs
- npm install body-parser
- npm install winston
- npm install winston-daily-rotate-file
- npm install nodemon
- npm install swagger-ui-express swagger-jsdoc
- npm install dotenv



# Ejecutar el proyecto
- npm -y init
- npm install

# Intalar todas las dependencias
"dependencies": {
    "bcryptjs": "^2.4.3",
    "body-parser": "^1.18.2",
    "dotenv": "^16.4.5",
    "express": "^4.16.3",
    "jsonwebtoken": "^8.2.1",
    "mongoose": "^8.4.0",
    "winston": "^2.4.2",
    "winston-daily-rotate-file": "^3.1.3"
  },
  "devDependencies": {
    "nodemon": "^3.1.7"
  }

# Agregar 
"start": "node src/server.js",
"dev": "nodemon src/server.js",

# correr el script
npm run dev


# Para trabajar con RabbitQM installar
- npm install amqplib

# Ejecutar el comando en la terminal
- rabbitmq-plugins enable rabbitmq_management

# Para abrir la interfaz de rabbitmq
- http://localhost:15672

# User : franz password: gonzales