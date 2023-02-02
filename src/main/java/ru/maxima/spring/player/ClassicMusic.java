package ru.maxima.spring.player;

import org.springframework.context.annotation.Bean;

public class ClassicMusic implements Music {
    @Override
    public String getSong() {
        return "Moon Sonata";
    }
}
