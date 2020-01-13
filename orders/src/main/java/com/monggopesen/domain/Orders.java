package com.monggopesen.domain;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Orders {

    @PrimaryKey
    private String id;
    private Product product;
    private int rentTime;

    public String getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public int getRentTime() {
        return rentTime;
    }

    public Orders() {
    }

    public Orders(String id, Product product, int rentTime) {
        this.id = id;
        this.product = product;
        this.rentTime = rentTime;
    }
}
