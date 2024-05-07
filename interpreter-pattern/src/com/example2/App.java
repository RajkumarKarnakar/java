package com.example2;

public class App {

    public static void main(String[] args) {
        var context = "hello world";
        System.out.println(context);
        var sentenceShouldEndWithAPeriod = new SentenceShouldEndWithPeriod();
        var result = sentenceShouldEndWithAPeriod.interpret(context);
        System.out.println(result);
    }
}
