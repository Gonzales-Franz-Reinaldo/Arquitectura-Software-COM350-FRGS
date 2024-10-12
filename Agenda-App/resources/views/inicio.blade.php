<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="{{ asset('css/styles.css') }}">
    <title>Document</title>
</head>
<body>
    <div class="container">
        <div class="menu">
            <a href="{{ route('inicio') }}">Inicio</a>
            <a href="{{ route('agenda') }}">Agenda</a>
            <a href="{{ route('profesion') }}">Profesion</a>
        </div>
        <div class="main">
            <div class="header">
                <h1>Agenda</h1>
            </div>

            <!-- Aqui es donde cargaremos los componentes -->
            <div class="contenido"></div>
        </div>
    </div>

</body>
</html>