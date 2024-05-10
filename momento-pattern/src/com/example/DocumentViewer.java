package com.example;

public class DocumentViewer {

    public static void main(String[] args) {

        var textDocument = new TextDocument();
        textDocument.write("Hello world");
        textDocument.save();
        textDocument.print();
        textDocument.write(" How are you?");
        textDocument.print();
        textDocument.save();
        textDocument.write(" fine");
        textDocument.print();
        textDocument.undo();
        System.out.println("------------");
        textDocument.print();
        System.out.println("------------");
        textDocument.undo();
        System.out.println();

    }
}
