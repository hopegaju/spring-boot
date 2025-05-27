package com.codewithgaju.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("stripe")
@Primary
public class StripePaymentService implements PaymentService {
    @Value("${stripe.apiUrl}")
    private String apiUrl;
    @Value("${stripe.enabled}")
    private boolean enabled;
    @Value("${stripe.timeout}")
    private int timeout;
    @Value("${stripe.supported-currencies}")
    private String supportedCurrency;
    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE PAYMENT");
        System.out.println("Api Url: " + apiUrl);
        System.out.println("Enabled: " + enabled);
        System.out.println("Timeout: " + timeout);
        System.out.println("Supported currencies: " + supportedCurrency);
        System.out.println("Amount: " + amount);
    }
}
