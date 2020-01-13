package com.monggopesen.domain;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.math.BigDecimal;

@Table
public class Product {
    @PrimaryKey
    private String id;
    private String name;
    private BigDecimal price;

    public Product() {
    }

    public Product(String id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
