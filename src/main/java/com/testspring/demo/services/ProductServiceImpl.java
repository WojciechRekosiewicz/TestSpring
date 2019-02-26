//package com.testspring.demo.services;
//
//import com.testspring.demo.entity.Product;
//import com.testspring.demo.repository.ProductRepository;
//import lombok.AllArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@AllArgsConstructor
//@Service
//public class ProductServiceImpl implements ProductService {
//
//    @Autowired
//    private ProductRepository productRepository;
////    private Prod
//
//
//    @Override
//    public List<Product> listAll() {
//        List<Product> products = new ArrayList<>();
//        productRepository.findAll().forEach(products::add);
//        return products;
//    }
//
//    @Override
//    public Optional<Product> getById(Long id) {
//        return productRepository.findById(id);
//    }
//
//    @Override
//    public Product saveOrUpdate(Product product) {
//        productRepository.save(product);
//        return product;
//    }
//
//    @Override
//    public void delete(Long id) {
//        productRepository.deleteById(id);
//
//    }
//}
