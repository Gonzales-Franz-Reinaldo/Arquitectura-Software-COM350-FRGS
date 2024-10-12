<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="{{ asset('css/profesion.css') }}">
    <title>Document</title>
</head>
<body>
    <div class="formulario-profesion">
        <h2>Crear Profesion</h2>
        <form action="{{route('profesion.store')}}" method="post">
            @csrf
            <div class="impust">
                <label for="nombre">Nombres:</label>
                <input type="text" name="nombre" id="nombre">
            </div>
            <button type="submit">Guardar</button>
        </form>
    </div>
</body>
</html>