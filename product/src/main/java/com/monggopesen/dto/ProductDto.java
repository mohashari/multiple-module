package com.monggopesen.dto;

import com.monggopesen.domain.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProductDto {
    private String id;
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

    public ProductDto(String id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product toProduct() {
        return new Product(UUID.randomUUID().toString(), this.name, this.price);
    }

    public static Product toProduct(ProductDto dto) {
        return new Product(UUID.randomUUID().toString(), dto.getName(), dto.getPrice());
    }

    public static List<ProductDto> toProductDtos(List<Product> products) {
        List<ProductDto> productDtos = new ArrayList<>();
        products.forEach(product -> {
            productDtos.add(product.toProductDto());
        });
        return productDtos;
    }
}
