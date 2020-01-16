package com.monggopesen.domain;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Orders {

    @PrimaryKey
    private String id;
    private String product;
    private int rentTime;

    public String getId() {
        return id;
    }

    public String getProduct() {
        return product;
    }

    public int getRentTime() {
        return rentTime;
    }

    public Orders() {
    }

    public Orders(String id, String product, int rentTime) {
        this.id = id;
        this.product = product;
        this.rentTime = rentTime;
    }
}
