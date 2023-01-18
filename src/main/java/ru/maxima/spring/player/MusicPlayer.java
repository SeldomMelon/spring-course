package ru.maxima.spring.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;



    public Music getMusic() {
        return music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


   public MusicPlayer(@Qualifier("rockMusic") Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void play() {
        System.out.println("Playing " + music.getSong());
    }
}
