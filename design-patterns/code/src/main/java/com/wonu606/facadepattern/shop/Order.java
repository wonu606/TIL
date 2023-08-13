package com.wonu606.facadepattern.shop;

public class Order {

    private Integer id;

    private Product product;

    public Order(Product product) {
        this.product = product;
    }

    public void registerId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", product=" + product +
                '}';
    }
}
