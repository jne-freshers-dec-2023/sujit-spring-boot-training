package com.myFirst.demoProject.configTest;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age){};

record address(String city, int house){};
record PersonDetails(String name, int age, address addr){};

@Configuration
public class AppConfig {

    @Bean
    public String name(){
        return "sujit";
    }

    @Bean
    public int age(){
        return 25;
    }
    @Bean (name = "personD")
    @Primary
    public Person person(){
        var person = new Person("sumit" , 27);
        return person;
    }

    @Bean (name = "persone")
    public Person person2(){
        var person = new Person("rohit" , 24);
        return person;
    }

    @Bean (name = "addressPersion")
    public address address(){
      return  new address("pune" , 323);

    }

    @Bean
    public PersonDetails details(String name, int age, address addressPersion){
        return new PersonDetails(name ,age ,addressPersion);
    }
}
