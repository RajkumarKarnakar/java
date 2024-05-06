package com.example;


public class App {

    public static void main(String[] args) {
        var message = "Hello World!";
        var request = new LoggerRequest(message, LoggerRequest.LogLevel.CONSOLE);
        Logger logger1 = new FileLogger();
        Logger logger2 = new ConsoleLogger();

        logger1.log(request);
        logger2.log(request);
    }
}
