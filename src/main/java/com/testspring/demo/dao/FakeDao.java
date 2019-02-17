package com.testspring.demo.dao;

import com.testspring.demo.entity.Product;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;

@Service
@Data
public class FakeDao {

 private static Map<String, Product> productRepo = new HashMap<>();
 static {
  Product honey = new Product();
  honey.setId("1");
  honey.setName("Honey");
  productRepo.put(honey.getId(), honey);

  Product almond = new Product();
  almond.setId("2");
  almond.setName("Almond");
  productRepo.put(almond.getId(), almond);
 }
 private String hehe = "Hi Ass.. I mean my friend";

 private String xd = "XD";

 public ResponseEntity<Object> getProduct() {
  return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
 }

 public ResponseEntity<Object> createProduct(@RequestBody Product product) {
  productRepo.put(product.getId(), product);
  return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
 }

}
