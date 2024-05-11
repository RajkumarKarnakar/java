package com.example2;

public class Recipe {

    public static void main(String[] args) {

        var vegPizza = new VeggiePizza();
        vegPizza.makeBase();
        vegPizza.addToppings();
        vegPizza.cook();

        var nonVegPizza = new NonVegPizza();
        nonVegPizza.makeBase();
        nonVegPizza.addToppings();
        nonVegPizza.cook();

        var paneerPizza = new PaneerPizza();
        paneerPizza.makeBase();
        paneerPizza.addToppings();
        paneerPizza.cook();

    }
}
