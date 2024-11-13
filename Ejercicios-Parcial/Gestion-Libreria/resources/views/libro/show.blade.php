@extends('layouts.app')

@section('content')
    <!-- Hacer un contenido para mostrar los datos del libro -->
    <div class="container mx-auto">
        <div class="flex justify-center items-center h-screen">
            <div class="bg-white p-8 rounded-lg shadow-md">
                <h2 class="text-2xl font-bold mb-4">Detalles del Libro</h2>
                <p class="mb-2"><strong>Título:</strong> {{ $libro->titulo }}</p>
                <p class="mb-2"><strong>Editorial:</strong> {{ $libro->editorial->nombre }}</p>
                <p class="mb-2"><strong>Edición:</strong> {{ $libro->edicion }}</p>
                <p class="mb-2"><strong>País:</strong> {{ $libro->pais }}</p>
                <p class="mb-2"><strong>Precio:</strong> {{ $libro->precio }}</p>
            </div>
        </div>
        <div class="flex justify-center items-center">
            <a href="{{route('libro.index')}}" class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded no-underline">Volver</a>
        </div>
    </div>
@endsection
