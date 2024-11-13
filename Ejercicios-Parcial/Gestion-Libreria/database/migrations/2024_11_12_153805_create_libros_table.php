<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     */
    public function up(): void
    {
    //     id :int
    // • titulo: varchar(100)
    // • editorial_id biginteger
    // • edicion:tinyint
    // • pais: varchar (50)
    // • precio:decimal(10,2)
        Schema::create('libros', function (Blueprint $table) {
            $table->id();
            $table->string('titulo', 100);
            $table->unsignedBigInteger('editorial_id');
            $table->foreign('editorial_id')->references('id')->on('editorial')->name('fk_prof');
            $table->tinyInteger('edicion');
            $table->string('pais', 50);
            $table->decimal('precio', 10, 2);
            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('libros');
    }
};
