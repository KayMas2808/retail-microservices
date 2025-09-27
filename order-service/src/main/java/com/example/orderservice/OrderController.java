package com.example.orderservice;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/{productId}")
    public String placeOrder(@PathVariable String productId) {
        return "Order placed for Product ID: " + productId;
    }
}
