package com.example;

public class PizzaFlavor {
    private String pizzaName;

    public PizzaFlavor(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    @Override
    public String toString() {
        return " is "+pizzaName;
    }
}
