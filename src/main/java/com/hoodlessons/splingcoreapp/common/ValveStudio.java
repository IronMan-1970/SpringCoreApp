package com.hoodlessons.splingcoreapp.common;

public class ValveStudio implements GameStudio
{
    public ValveStudio(){System.out.println("in constructor: " + getClass().getSimpleName());}
    @Override
    public String getNewGame() {
        return "Half Life 3";
    }
}
