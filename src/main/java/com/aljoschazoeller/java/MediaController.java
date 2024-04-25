package com.aljoschazoeller.java;

public class MediaController {
    public void playMedia(Playable playable) {
        System.out.println("Requesting " + playable.getClass());
        playable.play();
    }
}
