package com.example;

public class WelcomeEmail extends Email{
    @Override
    public void sendMessageBody(){
        System.out.println("Thank you for signing up for our service.");
    }

}
