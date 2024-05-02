package com.example;

public class DocumentPrinter {
    public void printDocument(){
        var spooler = PrintSpooler.getInstance();
        System.out.println("Printing document...");
        spooler.print();
    }
}
