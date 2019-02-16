package com.testspring.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/")
public class Mapping {

    @Autowired
    private Model model;

    @RequestMapping(value = "/")
    public String xd(){
        return model.getXd();
    }

    @RequestMapping(value = "/hi")
    public String tester(){
        return model.getHehe();    
    }

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
        @RequestMapping(value = "/products")
        public ResponseEntity<Object> getProduct() {
            return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
        }
}
