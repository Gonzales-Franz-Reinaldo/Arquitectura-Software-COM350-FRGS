<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="{{ asset('css/profesion.css') }}">
    <title>Datos de la Agenda</title>
</head>
<body>
    <div class="container-show">
        <h1>Datos de Profesion</h1>
        <div class="profesion">
            <p><span>ID:</span> {{ $profesion->id }}</p>
            <p><span>Nombre Profesion:</span> {{ $profesion->nombre }}</p>
        </div>
        <a href="{{ route('profesion.index') }}">Volver</a>
    </div>
</body>
</html>
