# Usa la imagen oficial de Node.js como base
FROM node:20.16.0-alpine

# Establece el directorio de trabajo en el contenedor
WORKDIR /app

# Copia el archivo package.json y package-lock.json
COPY package*.json ./

# Instala las dependencias de Node.js
RUN npm install

# Copia el código de la aplicación a /app
COPY . .

# Expone el puerto en el que correrá el servidor
EXPOSE 3002

# Define la variable de entorno para producción
ENV NODE_ENV=production

# Comando para iniciar el servidor
CMD ["node", "src/index.js"]


