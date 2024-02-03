package com.hoodlessons.splingcoreapp.common;


import org.springframework.stereotype.Component;

@Component
//@Primary
public class PlayStationStudios implements GameStudio {
    public PlayStationStudios(){
        System.out.println("in constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getNewGame() {
        return "The Last of Us 12";
    }
}
