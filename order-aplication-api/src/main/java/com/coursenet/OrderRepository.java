package com.coursenet;

import com.coursenet.model.Order;

import java.util.List;

public interface OrderRepository {
    Order getOrder(Long orderId);
    List<Order> getOrders();
    void  insertOrder(Order order);
    void  updateOrder(Order order);
    void  deleteOrder(Long orderId);

}
