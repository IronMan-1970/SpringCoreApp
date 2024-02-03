package com.hoodlessons.splingcoreapp.common;


import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class XboxGameStudios implements GameStudio{
    public XboxGameStudios(){
        System.out.println("in constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getNewGame() {
        return "Starfield";
    }
    //define our init method
//    @PostConstruct
//    public void doStartUpStuff()
//    {
//        System.out.println("Start up:" + getClass().getSimpleName());
//    }
//
//    //define our init method
//    @PreDestroy
//    public void doDestroyStuff()
//    {
//        System.out.println("Destroy :" + getClass().getSimpleName());
//    }
}
