package ru.maxima.spring.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    public List<Music> getMusicList() {
        return musicList;
    }

    @Autowired
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    private String name;


//    public MusicPlayer(@Qualifier("classicMusic") Music music) {
//        this.music = music;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



//    public Music getMusic() {
//        return music;
//    }
//
//    public void setMusic(Music music) {
//        this.music = music;
//    }


//    public void play() {
//        System.out.println("Playing: " + music.getSong());
//    }
}
