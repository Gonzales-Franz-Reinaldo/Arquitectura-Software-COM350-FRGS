<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="{{ asset('css/agendas.css') }}">
    <title>Agendas</title>
</head>
<body>
    <div class="container-agendas">
        <h1 class="title">Lista de Agendas</h1>
        <table class="styled-table">
            <thead>
                <tr>
                    <th>CI</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Celular</th>
                    <th>Correo</th>
                    <th>Profesión</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
                @foreach($agendas as $agenda)
                    <tr>
                        <td>{{ $agenda->ci }}</td>
                        <td>{{ $agenda->nombres }}</td>
                        <td>{{ $agenda->apellidos }}</td>
                        <td>{{ $agenda->celular }}</td>
                        <td>{{ $agenda->email }}</td>
                        <td>{{ $agenda->profesion->nombre }}</td>
                        <td class="options">
                            <a href="{{ route('agenda.edit', $agenda->id) }}" class="btn edit">Editar</a>
                            <form action="{{ route('agenda.destroy', $agenda->id) }}" method="POST" class="inline-form">
                                @csrf
                                @method('DELETE')
                                <button type="submit" class="btn delete">Eliminar</button>
                            </form>
                            <a href="{{ route('agenda.show', $agenda->id) }}" class="btn show">Ver</a>
                        </td>
                    </tr>
                @endforeach
            </tbody>
        </table>
        <a href="{{route('agenda.create')}}" class="btn create">Crear Agenda</a>
    </div>
</body>
</html>
