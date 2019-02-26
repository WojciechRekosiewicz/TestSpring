package com.testspring.demo.services;

import com.testspring.demo.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> listAll();

    Optional<Product> getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

//    Product saveOrUpdateProductFrom(ProductForm productForm);
}
