package com.example;

public class Item {

    private final int id;

    public Item(int id) {
        this.id = id;
    }

    public void addToBasket(){
        System.out.format("Item %d added to basket.\n",id);
    }

    public void removeFromBasket(){
        System.out.format("Item %d removed from basket.\n",id);
    }
}














