package com.testspring.demo.dao;

import com.testspring.demo.entity.Product;
import com.testspring.demo.exception.ProductNotFoundException;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;

@Service
@Data
public class FakeDao {

    private static Map<Integer, Product> productRepo;
    static {
        productRepo = new HashMap<Integer, Product>() {
           {
           put(1, new Product(1, "Honey"));
           put(2, new Product(2, "Fish"));
           }
          };
         }
    private String warmerWelcome = "Hi Ass.. I mean my friend";

    private String welcome = "Best welcome page in the history of mankind!!!";

    public ResponseEntity<Object> getProduct() {
        return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
 }

    public ResponseEntity<Object> getOneProduct(int id){
        return new ResponseEntity<>(productRepo.get(id), HttpStatus.OK);
    }

    public ResponseEntity<Object> createProduct(Product product) {
        productRepo.put(product.getId(), product);
        return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
 }

    public ResponseEntity<Object> updateProduct(int id, Product product){
        if(!productRepo.containsKey(id))throw new ProductNotFoundException();
        productRepo.remove(id);
        product.setId(id);
        productRepo.put(id, product);
        return new ResponseEntity<>("Product updated", HttpStatus.OK);
    }

    public ResponseEntity<Object> deleteProduct(int id){
        productRepo.remove(id);
        return new ResponseEntity<>("Product deleted!", HttpStatus.OK);
    }

}
