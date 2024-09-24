package Builder;

public class Pizza {
    private String size;
    private String crust;
    private String cheese;
    private String toppings;

    // Constructor privado para que solo se use el Builder para crear objetos Pizza
    private Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.crust = builder.crust;
        this.cheese = builder.cheese;
        this.toppings = builder.toppings;
    }

    @Override
    public String toString() {
        return "Pizza [size=" + size + ", crust=" + crust + ", cheese=" + cheese + ", toppings=" + toppings + "]";
    }

    
    // Clase Builder interna
    public static class PizzaBuilder {
        private String size;
        private String crust;
        private String cheese;
        private String toppings;

        public PizzaBuilder(String size) { // tamaño es obligatorio
            this.size = size;
        }

        public PizzaBuilder setCrust(String crust) {
            this.crust = crust;
            return this;
        }

        public PizzaBuilder setCheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder setToppings(String toppings) {
            this.toppings = toppings;
            return this;
        }

        // Método que devuelve el objeto final construido
        public Pizza build() {
            return new Pizza(this);
        }
    }
}

