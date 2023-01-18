package ru.maxima.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.maxima.spring.player.Music;
import ru.maxima.spring.player.MusicPlayer;
import ru.maxima.spring.player.RockMusic;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public RockMusic rockMusic () {
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer () {
        return new MusicPlayer(rockMusic());
    }

}
