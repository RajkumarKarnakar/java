package com.example;

public abstract class Meal {
    private Double price;

    public Meal(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return price.toString();
    }

    public abstract Meal clone();
}
