package com.testspring.demo.controller;


import com.testspring.demo.dao.FakeDao;
import com.testspring.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping(value = "/")
public class ProductController {

    @Autowired
    private FakeDao fakeDao;

    @RequestMapping(value = "/")
    public String xd(){
        return fakeDao.getWelcome();
    }

    @RequestMapping(value = "/hi")
    public String tester(){
        return fakeDao.getWarmerWelcome();
    }


    @RequestMapping(value = "/products")
    public ResponseEntity<Object> getProduct() {
        return fakeDao.getProduct();
    }


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody Product product) {
        return fakeDao.createProduct(product);
    }

//    @RequestMapping(value = "/products/{id}")
}
