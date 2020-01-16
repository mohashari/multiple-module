package com.monggopesen.controller;

import com.monggopesen.dto.OrdersDto;
import com.monggopesen.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {

    @Autowired
    private OrdersRepository ordersRepository;

    @PostMapping("/order")
    public ResponseEntity<?> create(@RequestBody OrdersDto dto) {
        ordersRepository.save(dto.toOrders());
        return new ResponseEntity<>("ok", HttpStatus.CREATED);
    }
}
