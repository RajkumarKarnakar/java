package com.example2;

import java.sql.Statement;

public class PausedState implements MediaPlayerState {
    @Override
    public void pressButton(MediaPlayer mediaPlayer) {
        mediaPlayer.play();

        mediaPlayer.setState(new PlayingState());
    }
}















