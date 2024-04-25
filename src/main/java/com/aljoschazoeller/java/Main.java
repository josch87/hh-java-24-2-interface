package com.aljoschazoeller.java;

public class Main {
    public static void main(String[] args) {
        MediaController mediaController = new MediaController();

        Playable music = new MusicPlayer();
        Playable video = new VideoPlayer();

        Playable userInput = music;

        mediaController.playMedia(userInput);
    }
}
