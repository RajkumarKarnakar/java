package com.example;

public class App {

    public static void main(String[] args) {
        var loginPage = new LoginPage();
        loginPage.logInUser(new PasswordAuthenticator());
        loginPage.logInUser(new SingleSignOnAuthenticator());

        System.out.println("---------OR---------");

        loginPage.logInUser(
                () -> System.out.println("Logging in with username and password!!"));
        loginPage.logInUser(
                () -> System.out.println("Logging in with single sign-on!!")
        );

        System.out.println("---------OR---------");

        loginPage.logInUser(Authenticator.passwordAuthenticator);
        loginPage.logInUser(Authenticator.singleSignOnAuthenticator);
    }
}












