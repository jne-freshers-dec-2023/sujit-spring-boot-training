package com.springBoot.HelloWorld1Rest.EcomerceWeb.product;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
public class ProductResource {

    @Autowired
    private ProductDaoService service;
    @GetMapping(path ="/products")
    public List<Product> getAllProducts(){
        return service.allProducts();
    }

    @GetMapping(path ="/products/{id}")
    public EntityModel<Product> getProduct(@PathVariable int id){
        Product product = service.findProduct(id);
        if(product == null){
            throw new UserNotFoundException("id: "+id);
        }
        EntityModel<Product> entityModel = EntityModel.of(product);
        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).getAllProducts());
        entityModel.add(link.withRel("all-user"));
        return entityModel;
    }

    @PostMapping(path ="/products")
    public ResponseEntity<Product> createProduct(@Valid @RequestBody Product product){
        Product returned = service.insertAnUser(product);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(returned.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(path ="/products/{id}")
    public void deleteProduct(@PathVariable int id){
         service.deleteProduct(id);
    }

}
