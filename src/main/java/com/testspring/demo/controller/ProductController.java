package com.testspring.demo.controller;


import com.testspring.demo.dao.FakeDao;
import com.testspring.demo.entity.Product;
import com.testspring.demo.exception.ProductNotFoundException;
import com.testspring.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping(value = "/")
public class ProductController {

    @Autowired
    private FakeDao fakeDao;

//    @Autowired
//    private ProductService productService;

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

    @RequestMapping(value = "/products/{id}")
    public ResponseEntity<Object> getOneProduct(@PathVariable("id") int id){
        return fakeDao.getOneProduct(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody Product product) {
        return fakeDao.createProduct(product);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateProduct(@PathVariable("id") int id, @RequestBody Product product) {
        return fakeDao.updateProduct(id, product);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    private ResponseEntity<Object> deleteProduct(@PathVariable("id") int id){
        return fakeDao.deleteProduct(id);
    }
}
