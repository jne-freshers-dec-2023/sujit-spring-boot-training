package com.myFirst.demoProject.controllerExample.gamesAndRunner;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperMario implements GamingConsole {
    public void up(){
        System.out.println("go up");
    }
    public void down(){
        System.out.println("go down");
    }
    public void left(){
        System.out.println("go left");
    }
    public void right(){
        System.out.println("go right");
    }
}
