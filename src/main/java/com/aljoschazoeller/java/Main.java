package com.aljoschazoeller.java;

public class Main {
    public static void main(String[] args) {
        MediaController mediaController = new MediaController();

        MusicPlayer music = new MusicPlayer();
        VideoPlayer video = new VideoPlayer();

        mediaController.playMedia(music);
        mediaController.playMedia(video);


    }
}
