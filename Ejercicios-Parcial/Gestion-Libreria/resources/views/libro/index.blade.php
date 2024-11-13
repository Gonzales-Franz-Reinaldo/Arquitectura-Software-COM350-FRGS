@extends('layouts.app')

@section('content')


<div class="contenido-libros space-y-4 ">
    <table class="min-w-full divide-y divide-gray-200 overflow-x-auto">
        <thead class="bg-gray-50">
            <tr class="text-center">
                <th class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">Titulo</th>
                <th class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">Editorial
                </th>
                <th class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">Edicion</th>
                <th class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">Pais</th>
                <th class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">Precio</th>
                <th class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">Acciones</th>
            </tr>
        </thead>
        <tbody>
            @foreach ($libros as $libro)
                <tr class="text-center">
                    <td>{{ $libro->titulo }}</td>
                    <td>{{ $libro->editorial->nombre }}</td>
                    <td>{{ $libro->edicion }}</td>
                    <td>{{ $libro->pais }}</td>
                    <td>{{ $libro->precio }}</td>
                    <td class="flex gap-1">
                        <a class="bg-green-500 hover:bg-green-700 text-white font-bold py-1 px-2 rounded no-underline"
                            href="{{route('libro.edit', $libro->id)}}" class="btn btn-primary">Editar</a>
                        <form action="{{route('libro.destroy', $libro->id)}}" method="POST">
                            @csrf
                            @method('DELETE')
                            <button type="submit"
                                class="bg-red-500 hover:bg-red-700 text-white font-bold py-1 px-2 rounded no-underline">Eliminar</button>
                        </form>
                        <a class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-1 px-2 rounded no-underline"
                            href="{{route('libro.show', $libro->id)}}">Mostrar</a>
                    </td>
                </tr>
            @endforeach
        </tbody>
    </table>

    <div class="flex justify-center">
        <a href=""
            class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-1 px-2 rounded no-underline">Agregar Libro</a>
    </div>
</div>

@endsection