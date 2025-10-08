package com.example.week3cicd;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/product")
@RestController
public class ProductController {
    List<Product> mylist = new ArrayList<>();

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/getProducts")
    public List<Product> getProduct(){
        Product myProduct = new Product("Tv", 4909);
        return mylist;
    }

    @PostMapping("/addProduct")
    public Product addProduct(@Valid @RequestBody Product myProduct){
        mylist.add(myProduct);
        return myProduct;
    }

    @GetMapping("/getCount")
    public int getCount(){
        return mylist.size();
    }

}
