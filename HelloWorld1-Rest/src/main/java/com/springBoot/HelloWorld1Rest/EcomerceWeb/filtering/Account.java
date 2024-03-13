package com.springBoot.HelloWorld1Rest.EcomerceWeb.filtering;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;

//@JsonIncludeProperties({"id","password"})
public class Account {
    private String id;
//    @JsonIgnore
    private String password;
    private String type;

    public Account(String id, String password, String type) {
        this.id = id;
        this.password = password;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
