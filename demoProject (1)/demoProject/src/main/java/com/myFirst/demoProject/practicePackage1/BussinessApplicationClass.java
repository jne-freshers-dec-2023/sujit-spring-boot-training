package com.myFirst.demoProject.practicePackage1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BussinessApplicationClass {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(BussinessApplicationClass.class);
        System.out.println(context.getBean(BusinessCalculationService.class).findMax());
    }
}
