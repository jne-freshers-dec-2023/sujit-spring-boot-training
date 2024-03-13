package com.firstStringBoot.project.example1.properyExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConfigController {

    @Autowired
    CurrencyServiceConfig config;
    @RequestMapping("/currencyconfiguration")
    public CurrencyServiceConfig retruveConfig(){
        return this.config;
    }

}
