package com.example;

public class LoggerRequest {

    private final String message;
    private final LogLevel level;

    public LoggerRequest(String message, LogLevel level) {
        this.message = message;
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public LogLevel getLevel() {
        return level;
    }

    public enum LogLevel {
        CONSOLE,
        FILE
    }
}
