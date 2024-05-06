package com.example2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger extends Logger {


    public FileLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(LoggerRequest request) {
        if(request.level()== LoggerRequest.LogLevel.FILE) {
            try {
                var writer = new BufferedWriter(new FileWriter("chain-of-responsibility-pattern/src/com/resources.txt", true));
                writer.write(request.message() + "\n"
                + " -rajkumar");
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (nextLogger != null )
            nextLogger.log(request);
    }
}























