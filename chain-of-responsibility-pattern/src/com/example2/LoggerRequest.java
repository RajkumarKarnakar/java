package com.example2;

public record LoggerRequest(String message, com.example2.LoggerRequest.LogLevel level) {

    public enum LogLevel {
        CONSOLE,
        FILE
    }
}
