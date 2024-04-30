package com.example2;

public class FrenchMessageAdaptor implements LocalizedMessage{

    private final FrenchLocalizedMessage frenchLocalizedMessage;

    public FrenchMessageAdaptor() {
        this.frenchLocalizedMessage = new FrenchLocalizedMessage();
    }

    @Override
    public void sayHello() {
        frenchLocalizedMessage.sayBonjour();
    }
}
