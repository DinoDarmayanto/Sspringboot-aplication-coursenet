package com.coursenet.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @SequenceGenerator(name = "order_seq", sequenceName = "orders_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_seq")
    private  Long Id;

    @Column(name = "name")
    private String name;
    private String description;

    public Order() {
    }

    public  Order(String name, String description){
        this.name = name;
        this.description = description;
    }

    public Order(Long id, String name, String description) {
        Id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
