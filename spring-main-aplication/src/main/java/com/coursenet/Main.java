package com.coursenet;

import com.coursenet.model.OrderDTO;
import com.coursenet.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class Main implements CommandLineRunner {
    public static void main(String[]args) {SpringApplication.run(Main.class, args);}

    @Autowired
    private  OrderController orderController;

    @Autowired
    private  UserController userController;


    @Override
    public void  run(String... args) throws Exception {
    orderController.createNewOrder("order 1", "jasson");
    orderController.createNewOrder("order 2", "jasson");
    orderController.createNewOrder("order 3", "jasson");
    orderController.createNewOrder("order 4", "jasson");

    orderController.getOrderList().forEach(orderDTO -> {
        System.out.println(orderDTO.getName()+ "" + orderDTO.getDescription());
    });

    OrderDTO findOrder = orderController.getOrder(1L);
        System.out.println(findOrder.getDescription());



    }
//        orderController.createNewOrder("Order 1", "Jasson");
//        OrderDTO orderDTO = orderController.getOrder( 1L);
//        System.out.println(orderDTO.getName());
//        orderController.getOrderList().forEach(order -> {
//            System.out.println(order.getName() + " - " + order.getDescription());
//                });
//
//        userController.createNewUser("Dino", "mypassword", "dinodarmayanto@gmail.com", "Jakarta", "08823737821");
//        UserDTO userDTO = userController.getUser("1");
//        System.out.println(userDTO.getUserName());
//        userController.getUserList().forEach(user -> {
//            System.out.println(user.getUserName() + " - " + user.getPassword());
//        });
//
//
//
//
//    }



}