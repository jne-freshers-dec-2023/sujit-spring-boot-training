package com.springBoot.HelloWorld1Rest.EcomerceWeb.productWithH2;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.springBoot.HelloWorld1Rest.EcomerceWeb.productWithH2.ordersPack.Orders;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
public class Product1 {
    @Id
    @GeneratedValue
    private int id;

    @Size(min = 2, message = "name should have atleast two charecter")
    private String name;

    @Max(value = 20000, message = "price should be lesser than 20000")
    private int price;

    @OneToMany(mappedBy = "product")
    private List<Orders> posts;

    public List<Orders> getPosts() {
        return posts;
    }

    public void setPosts(List<Orders> posts) {
        this.posts = posts;
    }

    public  Product1(){

    }

    public Product1(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
