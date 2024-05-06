package com.example2;

public class ConsoleLogger extends Logger {

    public ConsoleLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(LoggerRequest request) {
        if (request.level() == LoggerRequest.LogLevel.CONSOLE)
            System.out.println(request.message());
        else if (nextLogger != null)
            nextLogger.log(request);

    }
}
