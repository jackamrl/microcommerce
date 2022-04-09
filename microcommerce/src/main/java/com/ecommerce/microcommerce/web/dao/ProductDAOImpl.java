package com.ecommerce.microcommerce.web.dao;

import com.ecommerce.microcommerce.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO{
    public static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Telephone Android",50000));
        products.add(new Product(2, "Frigidaire",150000));
        products.add(new Product(3, "Television",400000));
        products.add(new Product(4, "PS5",250000));

        ;
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(int id) {
        for (Product product:products){
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }

    @Override
    public Product save(Product product) {
        products.add(product);
        return product;
    }
}
