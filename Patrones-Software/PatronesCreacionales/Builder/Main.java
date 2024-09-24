package Builder;


public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder("Grande") // Tamaño es obligatorio
                .setCrust("Masa gruesa")
                .setCheese("Mozzarella")
                .setToppings("Pepperoni y champiñones")
                .build();

        System.out.println(pizza);
    }
}
