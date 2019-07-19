package com.sapient.productservice.controller;

import com.sapient.productservice.model.Product;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

@RestController
@RequestMapping("/api/v1/products/")
@PropertySource("classpath:documentation.properties")
public class ProductsController {

    @GetMapping(value = "/", produces = {APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE})
    @ApiOperation(value = "Fetch all employees", notes = "API to fetch all the employees")
    public List<Product> listAll(){
        List<Product> products = Arrays.asList(new Product(), new Product(), new Product());
        return products;
    }

    @GetMapping(value = "/{id}", produces = {APPLICATION_XML_VALUE, APPLICATION_JSON_VALUE})
    public Product findById(@ApiParam(value = "${ProductController.FetchByID}", required = true)@PathVariable("id") int id){
        return new Product();
    }

    @PostMapping(value = "/", consumes = {APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE})
    public Product saveProduct( @Valid @RequestBody Product product){
        return  new Product();
    }

    @PutMapping(value = "/{id}", consumes = {APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE})
    public void updateProduct(@PathVariable int id, @RequestBody Product product){
        System.out.println("Came inside the update product method");
    }

    @DeleteMapping(value = "/{id}")
    public void deleteProduct(@PathVariable int id){
        System.out.println("Deleted the product successfully");
    }
}