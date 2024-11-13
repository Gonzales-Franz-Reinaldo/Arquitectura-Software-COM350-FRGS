<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\EditorialController;
use App\Http\Controllers\LibroController;

Route::get('/', function () {
    // return view('layouts.app');
    return view('principal');
});


Route::resource('editorial', EditorialController::class);
Route::resource('libro', LibroController::class);
