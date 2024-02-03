package com.hoodlessons.splingcoreapp.common;

import org.springframework.stereotype.Component;

@Component
//@Lazy
public class NintendoStudios implements GameStudio {

    public NintendoStudios(){
        System.out.println("in constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getNewGame() {
        return "The legend of Zelda: Breath of the wild";
    }
}
