<?php

namespace App\Http\Controllers;

use App\Models\Profesion;
use Illuminate\Http\Request;

class ProfesionController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        $profesiones = Profesion::all();

        //? PARA LISTAR     
        return view('profesion.index', compact('profesiones'));
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        return view('profesion.create');
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        $request->validate([
            'nombre' => 'required'
        ]);

        Profesion::create($request->all());

        return redirect()->route('profesion.index')->with('success', 'Profesión creada correctamente');
    }

    /**
     * Display the specified resource.
     */
    public function show(Profesion $profesion)
    {
        return view('profesion.show', compact('profesion'));
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(Profesion $profesion)
    {
        return view('profesion.edit', compact('profesion'));
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Profesion $profesion)
    {
        $request->validate([
            'nombre' => 'required'
        ]);

        $profesion->update($request->all());

        return redirect()->route('profesion.index')->with('success', 'Profesión actualizada correctamente');
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Profesion $profesion)
    {
        $profesion->delete();

        return redirect()->route('profesion.index')->with('success', 'Profesión eliminada correctamente');
    }
}
