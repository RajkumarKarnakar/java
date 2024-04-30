package com.example2;

public class MarathiMessageAdaptor implements LocalizedMessage{

    private final MarathiLocalizedMessage marathiLocalizedMessage;

    public MarathiMessageAdaptor() {
        this.marathiLocalizedMessage = new MarathiLocalizedMessage();
    }

    @Override
    public void sayHello() {
        marathiLocalizedMessage.sayNamaste();
    }
}
