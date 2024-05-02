package com.example;
/*
enum are thread-safe
 */
public enum PrintSpooler {

    INSTANCE;

    public static PrintSpooler getInstance() {

        return INSTANCE;
    }

    void print(){
        System.out.println("done!");
    }
}
