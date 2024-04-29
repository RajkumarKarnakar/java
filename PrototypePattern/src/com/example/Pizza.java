package com.example;

public class Pizza extends Meal{
    private PizzaFlavor flavor;

    public Pizza(Double price, PizzaFlavor flavor) {
        super(price);
        this.flavor = flavor;
    }

    public PizzaFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(PizzaFlavor flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "price " + super.toString()+
                " & flavor" + flavor +
                '}';
    }

    @Override
    public Pizza clone() {
        return new Pizza(this.getPrice(), new PizzaFlavor(this.getFlavor().getPizzaName()));
    }
}















