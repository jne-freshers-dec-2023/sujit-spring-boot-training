package com.springBoot.HelloWorld1Rest.EcomerceWeb.filtering;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilterController {

    @GetMapping("/filter")
    public Account getDetails(){
        return new Account("id", "password", "type");
    }

    @GetMapping("/filter-list")
    public List<Account> getDetailsList(){
        return Arrays.asList( new Account("id", "password", "type"),
                new Account("id2", "password2", "type2"));
    }
}
