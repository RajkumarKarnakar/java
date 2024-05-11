package com.example;

public class PasswordAuthenticator implements Authenticator{
    @Override
    public void logIn() {
        System.out.println("Logging in with username and password!");
    }
}
