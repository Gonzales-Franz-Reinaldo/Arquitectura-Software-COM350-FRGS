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
        <h2>Modificar Profesion</h2>
        <form action="{{route('profesion.update', $profesion->id)}}" method="post">
            @csrf
            @method('PUT')
            <div class="impust">
                <label for="nombre">Nombre:</label>
                <input type="text" name="nombre" id="nombre" value="{{$profesion->nombre}}">
            </div>
            <button type="submit">Guardar</button>
        </form>

        <a href="{{route('profesion.index')}}" class="btn volver">Volver</a>
    </div>
</body>
</html>