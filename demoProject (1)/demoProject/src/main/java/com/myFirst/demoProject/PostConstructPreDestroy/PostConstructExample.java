package com.myFirst.demoProject.PostConstructPreDestroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class Example1{
    public Example1(){
        System.out.println("initialization started in Example1");
    }


    public void initializeDB() {
        System.out.println("DB initialized");
    }
}

@Component
class Example2{
    Example1 ex1;
    public Example2(Example1 ex1){
        System.out.println("initialization Example2");
        this.ex1 = ex1;
    }

    @PostConstruct
    public void  initializeSome(){
        this.ex1.initializeDB();
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println("clean up completed");
    }
}



@Configuration
@ComponentScan
public class PostConstructExample {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(PostConstructExample.class)){

        }
    }
}
