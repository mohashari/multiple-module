package com.monggopesen.controller;

import com.monggopesen.domain.Product;
import com.monggopesen.dto.ProductDto;
import com.monggopesen.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/product")
    public ResponseEntity<?> create(@RequestBody ProductDto dto) {
        productRepository.save(dto.toProduct());
        return new ResponseEntity<>("ok", HttpStatus.CREATED);
    }

    @GetMapping("/product")
    public ResponseEntity<?> get() {
        List<Product> products = productRepository.findAll();
        return new ResponseEntity<>(ProductDto.toProductDtos(products), HttpStatus.OK);
    }


}
