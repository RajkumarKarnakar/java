package com.example2;

public abstract class Pizza {

    public void makeBase(){
        System.out.println("Mix flour, yeast, salt");
    }

    public abstract void addToppings();

    public void cook(){
        System.out.println("Cook in oven for 25 minutes");
    }
}
