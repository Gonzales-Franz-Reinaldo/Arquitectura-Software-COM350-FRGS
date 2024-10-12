<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="{{ asset('css/profesion.css') }}">
    <title>Document</title>
</head>
<body>
    <div class="container-profesion">
        <h1>Lista de Profesiones</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
                @foreach($profesiones as $profesion)
                    <tr>
                        <td>{{$profesion->id}}</td>
                        <td>{{$profesion->nombre}}</td>
                        <td class="options">
                            <a href="{{route('profesion.edit', $profesion->id)}}">Editar</a>
                            <a href="{{route('profesion.show', $profesion->id)}}">Ver</a>
                            <form action="{{route('profesion.destroy', $profesion->id)}}" method="POST">
                                @csrf
                                @method('DELETE')
                                <button type="submit">Eliminar</button>
                            </form>
                        </td>
                    </tr>
                @endforeach
            </tbody>
        </table>
        <a href="{{ route('profesion.create') }}">Crear Profesión</a>
    </div>
</body>
</html>