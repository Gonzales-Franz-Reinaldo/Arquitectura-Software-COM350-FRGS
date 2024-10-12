<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="{{ asset('css/agendas.css') }}">
    <title>Actualizar Agenda</title>
</head>
<body>
    <div class="formulario-agenda">
        <h2>Actualizar Agenda</h2>
        <form action="{{route('agenda.update', $agenda->id)}}" method="post">
            @csrf
            @method('PUT')
            <div class="impust">
                <label for="ci">CI:</label>
                <input type="text" name="ci" id="ci" value="{{$agenda->ci}}">
            </div>
            <div class="impust">
                <label for="nombres">Nombres:</label>
                <input type="text" name="nombres" id="nombres" value="{{$agenda->nombres}}">
            </div>
            <div class="impust">
                <label for="apellidos">Apellidos:</label>
                <input type="text" name="apellidos" id="apellidos" value="{{$agenda->apellidos}}">
            </div>
            <div class="impust">
                <label for="celular">Celular:</label>
                <input type="text" name="celular" id="celular" value="{{$agenda->celular}}">
            </div>
            <div class="impust">
                <label for="email">Correo:</label>
                <input type="email" name="email" id="email" value="{{$agenda->email}}">
            </div>
            <div class="impust">
                <label for="profesion_id">Profesión: </label>
                <select name="profesion_id" id="profesion_id">
                    @foreach($profesiones as $profesion)
                        <option value="{{$profesion->id}}" @selected($profesion->id == $agenda->profesion_id)>{{$profesion->nombre}}</option>
                    @endforeach
                </select>
            </div>
            <button type="submit">Actualizar</button>
        </form>

        <a href="{{route('agenda.index')}}" class="btn volver">Volver</a>
    </div>
</body>
</html>
