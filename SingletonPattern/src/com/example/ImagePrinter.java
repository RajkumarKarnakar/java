package com.example;

public class ImagePrinter {
    public void printImage(){
        var spooler = PrintSpooler.getInstance();
        System.out.println("Image Printing...");
        spooler.print();
    }
}
