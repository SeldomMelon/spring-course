package ru.maxima.spring.player;

import org.springframework.context.annotation.Bean;

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Highway to hell";
    }
}
