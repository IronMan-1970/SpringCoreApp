package com.hoodlessons.splingcoreapp.rest;


import com.hoodlessons.splingcoreapp.common.GameStudio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private GameStudio gameStudio;
    @Autowired
    public DemoController(@Qualifier("steam") GameStudio gameStudio)
    {
        System.out.println("in constructor: " + getClass().getSimpleName());
        this.gameStudio = gameStudio;

    }
    @GetMapping("/Game/New")
    private String returnNewGame()
    {
        return gameStudio.getNewGame();
    }

//    @GetMapping("/Scope/Test")
//    private  String returnScopeTest(){
//        return "Comparing beans: gameStudio == anotherGameStudio, " + (gameStudio == anotherGameStudio);
//    }

}
