package com.coursenet;

import com.coursenet.model.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;


@Controller
public class OderControllerimpl implements  OrderController{

    @Autowired
    Orderservice orderservice;

    @Override
    public  void createNewOrder(String name, String user){
        orderservice.createNewOrder(name, "order made by" + user);

    }

    @Override
    public List<OrderDTO> getOrderList(){
        return  orderservice.getOrderList();
    }

    @Override
    public  OrderDTO getOrder(Long orderId){
        return  orderservice.getOrder(orderId);
    }
}
