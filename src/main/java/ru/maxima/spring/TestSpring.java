package ru.maxima.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.maxima.spring.config.SpringConfig;
import ru.maxima.spring.player.ClassicMusic;
import ru.maxima.spring.player.Music;
import ru.maxima.spring.player.MusicPlayer;
import ru.maxima.spring.player.RockMusic;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

//        Music music = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.play();

        context.close();
    }
}
