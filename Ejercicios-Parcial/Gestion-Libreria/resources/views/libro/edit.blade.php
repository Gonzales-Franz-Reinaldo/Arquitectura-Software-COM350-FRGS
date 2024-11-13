@extends('layouts.app')

@section('content')

<div class="flex min-h-full flex-col justify-center px-6 py-12 lg:px-8">
    <div class="sm:mx-auto sm:w-full sm:max-w-sm">
        <img class="mx-auto h-10 w-auto" src="https://tailwindui.com/plus/img/logos/mark.svg?color=indigo&shade=600"
            alt="Your Company">
        <h2 class="mt-10 text-center text-2xl font-bold leading-9 tracking-tight text-gray-900">Editar Libro</h2>
    </div>

    <div class="mt-10 sm:mx-auto sm:w-full sm:max-w-sm border-2 border-gray-300 rounded-md p-4">
        <form class="space-y-6" action="{{ route('libro.update', $libro->id) }}" method="POST">
            @csrf
            @method('PUT')
            <div>
                <label for="titulo" class="block text-sm font-medium leading-6 text-gray-900">Titulo</label>
                <div class="mt-2">
                    <!-- padding en los imputs -->
                    <input id="titulo" name="titulo" type="text" autocomplete="titulo" required value="{{ $libro->titulo }}"
                        class="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6 px-2">
                </div>
            </div>
            <div>
                <label for="editorial_id" class="block text-sm font-medium leading-6 text-gray-900">Editorial</label>
                <select name="editorial_id" id="editorial_id" class="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
                    @foreach ($editoriales as $editorial)
                        <option value="{{ $editorial->id }}" {{ $libro->editorial_id == $editorial->id ? 'selected' : '' }}>{{ $editorial->nombre }}</option>
                    @endforeach
                </select>
            </div>

            <div>
                <label for="edicion" class="block text-sm font-medium leading-6 text-gray-900">Edicion</label>
                <div class="mt-2">
                    <input id="edicion" name="edicion" type="number" autocomplete="edicion" required value="{{ $libro->edicion }}"
                        class="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6 px-2">
                </div>
            </div>
            <div>
                <label for="pais" class="block text-sm font-medium leading-6 text-gray-900">Pais</label>
                <div class="mt-2">
                    <input id="pais" name="pais" type="text" autocomplete="pais" required value="{{ $libro->pais }}"
                        class="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6 px-2">
                </div>
            </div>
            <div>
                <label for="precio" class="block text-sm font-medium leading-6 text-gray-900">Precio</label>
                <div class="mt-2">
                    <input id="precio" name="precio" type="number" autocomplete="precio" required value="{{ $libro->precio }}"
                        class="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6 px-2">
                </div>
            </div>

            <div>
                <button type="submit"
                    class="flex w-full justify-center rounded-md bg-indigo-600 px-3 py-1.5 text-sm font-semibold leading-6 text-white shadow-sm hover:bg-indigo-500 focus-visible:outline focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-indigo-600">Actualizar Libro</button>
            </div>
        </form>

        <div class="mt-4">
            <a href="{{ route('libro.index') }}" class="mt-4 text-blue-500 hover:text-blue-700">Volver a la lista de libros</a>
        </div>
    </div>
</div>

@endsection
