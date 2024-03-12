package com.myFirst.demoProject.lazyInit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
class Example1{
  public Example1(){
      System.out.println("initialization started in Example1");
  }
}

@Component
@Lazy
class Example2{
    Example1 ex1;
    public Example2(Example1 ex1){
        System.out.println("initialization Example2");
        this.ex1 = ex1;
    }
}

@Configuration
@ComponentScan
public class LazyInitialization {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(LazyInitialization.class);
        System.out.println("initialization complete");
        context.getBean(Example2.class);
    }
}
