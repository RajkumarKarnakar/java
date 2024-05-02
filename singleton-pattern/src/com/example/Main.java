package com.example;

public class Main {
    public static void main(String[] args) {
        DocumentPrinter printer = new DocumentPrinter();
        ImagePrinter imagePrinter = new ImagePrinter();
        printer.printDocument();
        imagePrinter.printImage();
    }
}
