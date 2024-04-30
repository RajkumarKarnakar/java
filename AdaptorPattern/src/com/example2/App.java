package com.example2;

public class App {

    public static void main(String[] args) {
        var englishLocalizedMessage = new EnglishLocalizedMessage();
        var englishGreeting = new Greeting(englishLocalizedMessage);
        englishGreeting.print();

        var frenchLocalizedMessage = new FrenchMessageAdaptor();
        var frenchGreeting = new Greeting(frenchLocalizedMessage);
        frenchGreeting.print();

        var marathiLocalizedMessage = new MarathiMessageAdaptor();
        var marathiGreeting = new Greeting(marathiLocalizedMessage);
        marathiGreeting.print();
    }
}



















