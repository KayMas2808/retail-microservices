package com.example.payment_service;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController{
    @GetMapping("/{orderid}")
    public String getPaymentDetails(@PathVariable String orderid){
        double billAmount = 100.0;
        return "Payment for order: "+orderid+" | Total bill: Rs." + billAmount;
    }
}