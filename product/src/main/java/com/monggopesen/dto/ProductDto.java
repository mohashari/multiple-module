package com.monggopesen.dto;

import com.monggopesen.domain.Product;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductDto {
    private String name;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ProductDto() {
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public ProductDto(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public Product toProduct() {
        return new Product(UUID.randomUUID().toString(), this.name, this.price);
    }
}
