package com.springBoot.HelloWorld1Rest.hw1;


import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestFullHelloWorld {
//    @RequestMapping(method = RequestMethod.GET, path = "/Get-Hellow")
    @GetMapping(path = "/Get-Hellow")
    public String returningHellow(){
        return "Hellow World";
    }

    @GetMapping(path = "/Get-Hellow-Bean")
    public HellowBean returningHellowBean(){
        return new HellowBean("Hellow World");
    }
    @GetMapping(path = "/hello/{name}")
    public HellowBean helloWithName(@PathVariable String name){
        return new HellowBean("Hello , "+name);
    }

}
