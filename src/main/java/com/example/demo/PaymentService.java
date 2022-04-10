package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    @Value("${paypal.password}") //Внедрение значения свойств в bean-компоненты
    private String paypalPassword;

    public PaymentService(@Value("${paypal.url}") String paypalUrl) { //Либо вот так
        //this.paypalUrl = paypalUrl;
    }
}
