package com.coursenet;

import com.coursenet.model.OrderDTO;

import java.util.List;

public interface Orderservice {
    void  createNewOrder(String name, String user);
    List<OrderDTO> getOrderList();
    OrderDTO getOrder(Long orderId);

}
