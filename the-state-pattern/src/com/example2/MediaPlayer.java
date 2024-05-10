package com.example2;

public class MediaPlayer {
    private MediaPlayerState state;

    public MediaPlayer() {
        this.state = new PausedState();
    }

    public void pressButton(){
        state.pressButton(this);
    }

    public void play(){
        System.out.println("Playing");
        System.out.println("Displaying pause icon");
    }

    public void pause(){
        System.out.println("paused");
        System.out.println("Displaying play icon");
    }
    public void setState(MediaPlayerState state) {
        this.state = state;
    }
}
