package com.wonu606.facadepattern.shop;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

    private List<Order> orderList = new ArrayList<>();

    public Order create(Product product) {
        System.out.println("[OrderService] called create Method");
        Order order = new Order(product);
        order.registerId(orderList.size());
        orderList.add(order);
        System.out.println("Order 생성됨: " + order);
        return order;
    }
}
