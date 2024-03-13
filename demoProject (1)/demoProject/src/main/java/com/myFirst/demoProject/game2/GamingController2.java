package com.myFirst.demoProject.game2;

import game.gameRunner;
import game.gamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GamingController2 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
        context.getBean(gamingConsole.class).up();
        context.getBean(gameRunner.class).run();
    }
}
