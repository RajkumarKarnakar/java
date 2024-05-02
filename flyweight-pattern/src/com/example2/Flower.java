package com.example2;

public class Flower {

    private String name;

    public Flower(String name) {
        this.name = name;
        System.out.println("Flower " + name + " is being created");
        try
        {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Flower " + name + " is done");
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                '}';
    }
}















