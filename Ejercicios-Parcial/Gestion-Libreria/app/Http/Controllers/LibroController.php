<?php

namespace App\Http\Controllers;

use App\Models\Libro;
use Illuminate\Http\Request;
use App\Models\Editorial;

class LibroController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        $libros = Libro::all();
        return view('libro.index', ['libros' => $libros]);
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        $editoriales = Editorial::all();
        return view('libro.create', ['editoriales' => $editoriales]);
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        Libro::create($request->all());
        return redirect()->route('libro.index');
    }

    /**
     * Display the specified resource.
     */
    public function show(Libro $libro)
    {
        return view('libro.show', ['libro' => $libro]);
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(Libro $libro)
    {
        $editoriales = Editorial::all();
        return view('libro.edit', ['libro' => $libro, 'editoriales' => $editoriales]);
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Libro $libro)
    {
        $libro->update($request->all());
        return redirect()->route('libro.index');
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Libro $libro)
    {
        $libro->delete();
        return redirect()->route('libro.index');
    }
}
