package com.testspring.demo.entity;


import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class Product {

    private String id;
    private String name;

}
