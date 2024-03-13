package com.myFirst.demoProject.controllerExample;

import com.myFirst.demoProject.controllerExample.gamesAndRunner.GameRunner;
import com.myFirst.demoProject.controllerExample.gamesAndRunner.GamingConsole;
import game.gamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.myFirst.demoProject.controllerExample.gamesAndRunner")
public class GameControllerApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(GameControllerApplication.class);
        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();
    }
}
