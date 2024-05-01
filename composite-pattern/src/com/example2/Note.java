package com.example2;

import java.util.Arrays;

public class Note implements Playable{

    private final String value;

    public Note(String value) {
        this.value = value;
    }
@Override
    public void play(){
        System.out.format("'%s' ", (value));
    }
}
