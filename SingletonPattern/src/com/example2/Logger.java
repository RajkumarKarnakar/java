package com.example2;
/*
public class Logger {

    void log(String logMessage) {
        System.out.println(logMessage);
    }
}
OR
*/
public enum Logger {
    INSTANCE;

    void log(String message) {
        System.out.println(message);
    }
}


