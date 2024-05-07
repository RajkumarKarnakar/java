package com.example;

public class NoWhiteSpace implements Expression{
    @Override
    public String interpret(String context) {
        return context.replaceAll(" ","");
    }
}
