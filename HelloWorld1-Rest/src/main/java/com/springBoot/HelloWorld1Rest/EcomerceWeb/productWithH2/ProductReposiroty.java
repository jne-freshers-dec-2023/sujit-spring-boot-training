package com.springBoot.HelloWorld1Rest.EcomerceWeb.productWithH2;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductReposiroty extends JpaRepository<Product1, Integer> {
}
