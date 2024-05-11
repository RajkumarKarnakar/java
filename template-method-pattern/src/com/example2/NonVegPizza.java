package com.example2;

public class NonVegPizza extends Pizza{
    @Override
    public void addToppings() {
        System.out.println("Add pepper, chicken and sauce");
    }
}
