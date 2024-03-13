package com.myFirst.demoProject.configTest;

import com.myFirst.demoProject.configTest.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application02 {
    public static void main(String[] args) {
       try( var context = new AnnotationConfigApplicationContext(AppConfig.class)) {
           System.out.println(context.getBean("name"));
           System.out.println(context.getBean("age"));
           System.out.println(context.getBean("personD"));
           System.out.println(context.getBean(Person.class));
           System.out.println(context.getBean("details"));
           String a[] = context.getBeanDefinitionNames();
//        for(int i = 0; i< a.length;i++){
//            System.out.println(a[i]);
//             }
       }
    }
}
