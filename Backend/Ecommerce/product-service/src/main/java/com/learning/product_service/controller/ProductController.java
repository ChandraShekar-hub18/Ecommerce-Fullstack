package com.learning.product_service.controller;

import com.learning.product_service.entity.Product;
import com.learning.product_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping(path = "/saveProduct")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @GetMapping(path = "/allProducts")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping(path="/getProductById/{productId}")
    public Product getProductById(@PathVariable Long productId) {
        return productService.getProductById(productId);
    }

    @DeleteMapping(path="/deleteProductById/{productId}")
    public String deleteProductById(@PathVariable Long productId) {
        productService.deleteProductById(productId);
        return "Product with ID " + productId + " deleted successfully.";
    }

}
