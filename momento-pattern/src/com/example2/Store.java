package com.example2;

public class Store {

    public static void main(String[] args) {
        var item = new Item(25);
        item.save();
        System.out.println("Item price is " + item.getPrice());
        item.setPrice(10);
        System.out.println("Item price is " + item.getPrice());
        item.undo();
        item.setPrice(15);
        System.out.println("Item price is " + item.getPrice());
        item.undo();
        System.out.println("Item price is " + item.getPrice());

    }
}
