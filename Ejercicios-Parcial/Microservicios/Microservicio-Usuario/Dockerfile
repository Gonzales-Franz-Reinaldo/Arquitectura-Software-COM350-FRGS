# Usa la imagen oficial de Node.js como base
# Usa una imagen base de Node.js
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
EXPOSE 3000

# Define la variable de entorno para producción
ENV NODE_ENV=production

# Comando para iniciar la aplicación
# CMD ["npm", "start"]
# Comando para iniciar el servidor
CMD ["node", "src/server.js"]

