package com.example2;

public class Circle implements Shape{

    private final Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void getType() {
        System.out.println("Circle");
    }

    public Color getColor() {
       return color;
    }
}
