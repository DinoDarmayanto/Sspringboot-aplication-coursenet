package com.coursenet;

import com.coursenet.model.Order;
import com.coursenet.model.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Orderserviceimpl implements Orderservice {

    @Autowired
    private OrderRepositoryJPA orderRepository;

    @Override
    public void createNewOrder(String name, String user) {
 orderRepository.save(
         new Order(
                 name,
                 "Order made by" + user
         )
         );
    }

        // add data to table order_user
        // reduce stock from table produc

    @Override
    public List<OrderDTO> getOrderList() {
        List<Order> orders = orderRepository.findAll();
        List<OrderDTO> orderDTOS = orders.stream().map(order -> new OrderDTO(order.getName(), order.getDescription())).toList();
        return orderDTOS;
    }

    @Override
    public OrderDTO getOrder(Long orderId) {
        Order order = orderRepository.findById(orderId).orElse(null);
        if (order == null){
            return null;
        }
        return new OrderDTO(
                order.getName(),
                order.getDescription()
        );
    }
}
