package com.example;

import java.util.List;

public class OrderTracker {

    public static void main(String[] args) {

        PizzaFlavor indian = new PizzaFlavor("indian");
        Pizza indianPizza1 = new Pizza(299d, indian);
        Pizza indianPizza2 = indianPizza1.clone();
        Pizza indianPizza3 = indianPizza1.clone();
        Pizza indianPizza4 = indianPizza1.clone();
        Pizza indianPizza5 = indianPizza1.clone();

        indian.setPizzaName("indian masala");

        PizzaFlavor italian = new PizzaFlavor("italian");
        Pizza italianPizza1 = new Pizza(299d,italian);
        Pizza italianPizza2 = italianPizza1.clone();
        Pizza italianPizza3 = italianPizza1.clone();
        Pizza italianPizza4 = italianPizza1.clone();
        Pizza italianPizza5 = italianPizza1.clone();
        italian.setPizzaName("italian masala");

        List<Pizza> order = List.of(indianPizza1,indianPizza2,indianPizza3,indianPizza4,indianPizza5,
                italianPizza1,italianPizza2,italianPizza3,italianPizza4,italianPizza5);
        placeOrder(order);
    }
    private static void placeOrder(List<Pizza> order) {
        System.out.println("Ordered placing " + order.size() + " pizzas");
        order.forEach(System.out::println);
    }
}











