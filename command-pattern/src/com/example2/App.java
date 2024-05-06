package com.example2;

public class App {

    public static void main(String[] args) {
        var light = new Light();
        var lightCommandExecutor = new LightCommandExecutor();

        light.isOn();

        lightCommandExecutor.execute(new TurnOnLightCommand(light));

        light.isOn();


    }
}
