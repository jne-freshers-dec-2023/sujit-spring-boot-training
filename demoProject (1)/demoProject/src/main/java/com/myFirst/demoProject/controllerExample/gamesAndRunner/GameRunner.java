package com.myFirst.demoProject.controllerExample.gamesAndRunner;

import game.gamingConsole;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    GamingConsole game;
    public GameRunner(@Qualifier("PackmanGameQualifier") GamingConsole game){
        this.game = game;
    }
    public void run(){
        System.out.println("game is running :"+game);
        game.up();
        game.down();
    }
}
