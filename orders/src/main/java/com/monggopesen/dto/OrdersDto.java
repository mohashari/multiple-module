package com.monggopesen.dto;

import com.monggopesen.domain.Orders;

import java.util.UUID;

public class OrdersDto {

    private String id;
    private String product;
    private int rentTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getRentTime() {
        return rentTime;
    }

    public void setRentTime(int rentTime) {
        this.rentTime = rentTime;
    }

    public OrdersDto() {
    }

    public OrdersDto(String id, String product, int rentTime) {
        this.id = id;
        this.product = product;
        this.rentTime = rentTime;
    }

    public Orders toOrders() {
        return new Orders(UUID.randomUUID().toString(), this.product, this.rentTime);
    }
}
