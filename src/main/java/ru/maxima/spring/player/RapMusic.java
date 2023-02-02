package ru.maxima.spring.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class RapMusic implements Music {

    @Override
    public String getSong() {

        return "Skriptonit";
    }
}
