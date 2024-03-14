package com.springBoot.HelloWorld1Rest.EcomerceWeb.productWithH2;

import com.springBoot.HelloWorld1Rest.EcomerceWeb.product.UserNotFoundException;
import com.springBoot.HelloWorld1Rest.EcomerceWeb.productWithH2.ordersPack.Orders;
import com.springBoot.HelloWorld1Rest.EcomerceWeb.productWithH2.ordersPack.OrdersRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class Product1Resource {
    @Autowired
    private ProductReposiroty productReposiroty;
    @Autowired
    private OrdersRepository ordersRepository;

    @GetMapping(path ="/product1/products")
    public List<Product1> getAllProducts(){
        return productReposiroty.findAll();
    }

    @GetMapping(path ="/product1/products/{id}")
    public EntityModel<Product1> getProduct(@PathVariable int id){
        Optional<Product1> product = productReposiroty.findById(id);
        if(product.isEmpty()){
            throw new UserNotFoundException("id: "+id);
        }
        EntityModel<Product1> entityModel = EntityModel.of(product.get());
        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).getAllProducts());
        entityModel.add(link.withRel("all-user"));
        return entityModel;
    }

    @PostMapping(path ="/product1/products")
    public Product1 createProduct(@Valid @RequestBody Product1 product){
        Product1 returned = productReposiroty.save(product);
//        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
//                .path("/{id}").buildAndExpand(returned.getId()).toUri();
//        return ResponseEntity.created(location).build();
        return product;
    }

    @DeleteMapping(path ="/product1/products/{id}")
    public void deleteProduct(@PathVariable int id){
        productReposiroty.deleteById(id);
    }

    @GetMapping(path ="/product1/products/{id}/orders")
    public List<Orders> getOrdersOfProduct(@PathVariable int id){
        Optional<Product1> product = productReposiroty.findById(id);
        if(product.isEmpty()){
            throw new UserNotFoundException("id: "+id);
        }
       return product.get().getPosts();
    }


    @PostMapping(path ="/product1/products/{id}/orders")
    public ResponseEntity<Object> postOrdersOfProduct(@PathVariable int id, @Valid @RequestBody Orders order){
        Optional<Product1> product = productReposiroty.findById(id);
        if(product.isEmpty()){
            throw new UserNotFoundException("id: "+id);
        }
        order.setProduct(product.get());
        Orders savedOrder = ordersRepository.save(order);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(savedOrder.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
}
