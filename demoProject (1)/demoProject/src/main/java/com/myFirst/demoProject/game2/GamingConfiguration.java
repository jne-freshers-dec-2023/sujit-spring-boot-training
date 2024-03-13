package com.myFirst.demoProject.game2;


import com.myFirst.demoProject.Gamecontroller;
import game.gameRunner;
import game.packManGame;
import game.gamingConsole;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public gamingConsole game(){
        var game = new packManGame();
        return game;
    }

    @Bean
    public gameRunner gameRunner(gamingConsole game ){
        var gameRunner = new gameRunner(game);
        return gameRunner;
    }


}
