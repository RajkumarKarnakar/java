package com.example2;


public class App {

    public static void main(String[] args) {
        var message = "Hello World!";
        var request = new LoggerRequest(message, LoggerRequest.LogLevel.FILE);
        Logger logger1 = buildChain();
        logger1.log(request);
    }
    private static Logger buildChain(){
        var fileLogger = new FileLogger(null);
        return new ConsoleLogger(fileLogger);
    }
}
