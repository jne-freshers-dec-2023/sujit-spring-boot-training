package com.springBoot.HelloWorld1Rest.EcomerceWeb.productWithH2;

import com.springBoot.HelloWorld1Rest.EcomerceWeb.product.UserNotFoundException;
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
    private ProductReposiroty reposiroty;

    @GetMapping(path ="/product1/products")
    public List<Product1> getAllProducts(){
        return reposiroty.findAll();
    }

    @GetMapping(path ="/product1/products/{id}")
    public EntityModel<Product1> getProduct(@PathVariable int id){
        Optional<Product1> product = reposiroty.findById(id);
        if(product.isEmpty()){
            throw new UserNotFoundException("id: "+id);
        }
        EntityModel<Product1> entityModel = EntityModel.of(product.get());
        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).getAllProducts());
        entityModel.add(link.withRel("all-user"));
        return entityModel;
    }

    @PostMapping(path ="/product1/products")
    public ResponseEntity<Product1> createProduct(@Valid @RequestBody Product1 product){
        Product1 returned = reposiroty.save(product);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(returned.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(path ="/product1/products/{id}")
    public void deleteProduct(@PathVariable int id){
        reposiroty.deleteById(id);
    }

}
