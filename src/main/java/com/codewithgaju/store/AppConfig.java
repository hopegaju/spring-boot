package com.codewithgaju.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${payment-gateway}")
    private String paymentGateway;
    @Bean
    public PaymentService stripe(){
        return new StripePaymentService();
    }

    @Bean
    public PaymentService paypal(){
        return new PaypalPaymentService();
    }
    @Bean
    public OrderService orderservice(){
        if(paymentGateway.equalsIgnoreCase("stripe")){
            return new OrderService(stripe());
        }
            return new OrderService(paypal());

    }
}
