package com.springBoot.HelloWorld1Rest.EcomerceWeb.product;

import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

@Component
public class ProductDaoService {
    private static List<Product> products = new ArrayList<>();
    private static int productId = 0;

    static {
        products.add(new Product(++productId,"Bottle",345));
        products.add(new Product(++productId,"laptop",75000));
        products.add(new Product(++productId,"mobile",19000));
        products.add(new Product(++productId,"calculator",999));
    }


    public List<Product> allProducts(){
        return products;
    }

    public Product findProduct(int id){
        Predicate<? super Product> predicate = product -> {
            return Objects.equals(product.getId(), id);
        };
       return products.stream().filter(predicate).findFirst().orElse(null);
    }
    public Product insertAnUser(Product product){
        product.setId(++productId);
        products.add(product);
        return product;
    }
    public void deleteProduct(int id){
        Predicate<? super Product> predicate = product -> {
            return Objects.equals(product.getId(), id);
        };
        products.removeIf(predicate);
    }


}
