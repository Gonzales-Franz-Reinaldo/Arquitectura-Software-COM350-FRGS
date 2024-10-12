<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="{{ asset('css/agendas.css') }}">
    <title>Datos de la Agenda</title>
</head>
<body>
    <div class="container-show">
        <h1>Datos de la Agenda</h1>
        <div class="agenda">
            <p><span>CI:</span> {{ $agenda->ci }}</p>
            <p><span>Nombres:</span> {{ $agenda->nombres }}</p>
            <p><span>Apellidos:</span> {{ $agenda->apellidos }}</p>
            <p><span>Celular:</span> {{ $agenda->celular }}</p>
            <p><span>Correo:</span> {{ $agenda->email }}</p>
            <p><span>Profesión:</span> {{ $agenda->profesion->nombre }}</p>
        </div>
        <a href="{{ route('agenda.index') }}">Volver</a>
    </div>
</body>
</html>
