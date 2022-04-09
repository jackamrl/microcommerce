package com.ecommerce.microcommerce.web.controller;

import com.ecommerce.microcommerce.model.Product;
import com.ecommerce.microcommerce.web.dao.ProductDAO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final ProductDAO productDAO;

    public ProductController(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @GetMapping("/Produits")
    public List<Product> listeProduits(){
        return productDAO.findAll();
    }

    @GetMapping("/Produits/{id}")
    public Product afficherUnProduit(@PathVariable int id){
        return productDAO.findById(id);
    }
}
