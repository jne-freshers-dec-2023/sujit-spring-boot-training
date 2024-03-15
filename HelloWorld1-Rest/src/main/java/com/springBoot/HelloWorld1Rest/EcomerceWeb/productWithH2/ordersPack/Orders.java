package com.springBoot.HelloWorld1Rest.EcomerceWeb.productWithH2.ordersPack;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springBoot.HelloWorld1Rest.EcomerceWeb.productWithH2.Product1;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
public class Orders  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min = 3)
    private String model;

    @ManyToOne
    @JsonIgnore
    private Product1 product;

    public Product1 getProduct() {
        return product;
    }

    public void setProduct(Product1 product) {
        this.product = product;
    }

    public  Orders(){

    }
    public Orders(int id, String model) {
        this.id = id;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", product=" + product +
                '}';
    }
}
