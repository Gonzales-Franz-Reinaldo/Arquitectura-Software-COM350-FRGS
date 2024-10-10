<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\AgendaController;
use App\Http\Controllers\ProfesionController;

Route::get('/', function () {
    return view('welcome');
});


// Agregamos las rutas para navegar
Route::resource('agenda', AgendaController::class);
Route::resource('profesion', ProfesionController::class);	