package com.monggopesen.domain;

import com.monggopesen.dto.ProductDto;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.math.BigDecimal;

@Table
public class Product {
    @PrimaryKey
    private String id;
    private String name;
    private BigDecimal price;

    public Product(String id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ProductDto toProductDto() {
        return new ProductDto(this.id, this.name, this.price);
    }

    public static ProductDto toProductDto(Product product) {
        return new ProductDto(product.getId(), product.getName(), product.getPrice());
    }


}
