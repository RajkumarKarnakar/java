package com.example;

public class App {

    public static void main(String[] args) {
        var context = "M y V a r i  a b l e";
        var firstLetterShouldNotBeUnderscore = new FirstLetterShouldNotBeUnderscore();
        var result = firstLetterShouldNotBeUnderscore.interpret(context);
        System.out.println(result);
    }
}
