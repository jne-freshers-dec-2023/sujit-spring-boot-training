package com.myFirst.demoProject.controllerExample.gamesAndRunner;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PackmanGameQualifier")
public class PackmanGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("fly up");
    }

    @Override
    public void down() {
        System.out.println("fly down");
    }

    @Override
    public void left() {
        System.out.println("fly left");
    }

    @Override
    public void right() {
        System.out.println("fly right");
    }
}
