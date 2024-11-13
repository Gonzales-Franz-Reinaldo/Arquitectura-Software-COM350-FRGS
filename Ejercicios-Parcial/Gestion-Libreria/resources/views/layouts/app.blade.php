<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Libro App</title>
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
    <!-- Para boostrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>

<body class="bg-gray-100">
    <ul class="flex">
        <li class="mr-6">
            <a class="text-blue-500 hover:text-blue-800" href="#">Active</a>
        </li>
        <li class="mr-6">
            <a class="text-blue-500 hover:text-blue-800" href="#">Link</a>
        </li>
        <li class="mr-6">
            <a class="text-blue-500 hover:text-blue-800" href="#">Link</a>
        </li>
        <li class="mr-6">
            <a class="text-gray-400 cursor-not-allowed" href="#">Disabled</a>
        </li>
    </ul>
    <!-- Sidebar -->
    <div class="h-screen w-64 bg-gray-800 text-gray-100 fixed top-0 left-0 overflow-y-auto ">
        <div class="p-4">
            <h class="text-lg font-bold">Libreria 2024</h>
            <!-- Add your sidebar menu items here -->
            <ul class="mt-4">
                <li><a href="/" class="block py-2 px-4 text-white hover:bg-gray-700 no-underline">Inicio</a></li>
                <li><a href="{{route('libro.index')}}" class="block py-2 px-4 text-white hover:bg-gray-700 no-underline">Listar Libros</a></li>
                <li><a href="{{route('libro.create')}}" class="block py-2 px-4 text-white hover:bg-gray-700 no-underline">Insertar Libro</a></li>
                <li><a href="" class="block py-2 px-4 text-white hover:bg-gray-700 no-underline">Editoriales</a>
                </li>
                <!-- Add more menu items as needed -->
            </ul>
        </div>
    </div>

    <!-- Content Area -->
    <div class="ml-64 p-4 "> <!-- ml-64 to offset the sidebar width -->
        <!-- Header -->
        <header class="bg-white shadow-md p-4 mb-4 hidden">
            <div class="flex justify-between items-center">
                <div>
                    <h2 class="text-lg font-semibold">Bienvenido Usuario</h2>
                </div>
                <div>
                    <!-- Add any header actions or components here -->
                </div>
            </div>
        </header>

        <!-- Main Content Area -->
        <div class="bg-white p-6 shadow-md">
            @yield('content')

        </div>
    </div>

</body>

</html>
