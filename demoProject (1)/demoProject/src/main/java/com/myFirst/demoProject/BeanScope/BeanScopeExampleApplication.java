package com.myFirst.demoProject.BeanScope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)

class Example1{

}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class Example2{
    Example1 ex1;
    public  Example2(Example1 ex1){
        System.out.println("initialization completed");
        this.ex1 = ex1;
    }
}

@Configuration
@ComponentScan
public class BeanScopeExampleApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(BeanScopeExampleApplication.class);
        System.out.println(context.getBean(Example1.class));
        System.out.println(context.getBean(Example1.class));
        System.out.println(context.getBean(Example1.class));
        System.out.println(context.getBean(Example1.class));



        System.out.println(context.getBean(Example2.class));
        System.out.println(context.getBean(Example2.class));
        System.out.println(context.getBean(Example2.class));

    }
}
