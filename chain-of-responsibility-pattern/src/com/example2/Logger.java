package com.example2;

public abstract class Logger {

    public final Logger nextLogger;

    protected Logger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public abstract void log(LoggerRequest request);

}
