<?php

namespace Database\Factories;

use Illuminate\Database\Eloquent\Factories\Factory;
use App\Models\Editorial;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\Libro>
 */
class LibroFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array<string, mixed>
     */
    public function definition(): array
    {

        $editorial = Editorial::all()->random();
        return [
            'titulo' => $this->faker->sentence(3),
            'editorial_id' => $editorial->id,
            'edicion' => $this->faker->numberBetween(1, 10),
            'pais' => $this->faker->country(),
            'precio' => $this->faker->randomFloat(2, 1, 1000),
        ];
    }
}
