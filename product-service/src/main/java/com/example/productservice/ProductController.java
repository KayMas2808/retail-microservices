package com.example.productservice;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/products")
public class ProductController{
    private final RestTemplate restTemplate;
    public ProductController(RestTemplate rs){
        this.restTemplate = rs;
    }
    @GetMapping("/{id}/order")
    public String orderProduct(@PathVariable String id){
        String orderServiceUrl = "http://order-service:8082/orders/"+id;
        String paymentServiceUrl = "http://payment-service:8083/payments/"+id;

        String orderResponse = restTemplate.getForObject(orderServiceUrl, String.class);
        String paymentResponse = restTemplate.getForObject(paymentServiceUrl, String.class);

        return "Product ID: " + id + " | " + orderResponse + " | " + paymentResponse;

    }
}