package com.codewithgaju.store;

import jakarta.annotation.Resource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext contex =SpringApplication.run(StoreApplication.class, args);
        var orderservice = contex.getBean(OrderService.class);
        orderservice.placeOrder();
    }

}
