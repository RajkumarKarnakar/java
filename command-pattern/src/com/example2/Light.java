package com.example2;

public class Light {

    private boolean isOn = false;

    public void turnOnLight() {
        isOn = true;
    }

    public void turnOffLight() {
        isOn = false;
    }

    public void isOn() {
        System.out.format("Light is: %s\n", isOn ? "on" : "off");
    }
}















