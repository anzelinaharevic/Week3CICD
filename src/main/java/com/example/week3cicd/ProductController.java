package com.example.week3cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/product")
@RestController
public class ProductController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/getProduct")
    public Product getProduct(){
        Product myProduct = new Product("Tv", 4909);
        return myProduct;
    }

}
