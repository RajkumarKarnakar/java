package com.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger extends Logger {


    @Override
    public void log(LoggerRequest request) {
        try {
            var writer = new BufferedWriter(new FileWriter("chain-of-responsibility-pattern/src/com/resources.txt", true));
            writer.write(request.getMessage() + "\n"
            + " -rajkumar");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}























