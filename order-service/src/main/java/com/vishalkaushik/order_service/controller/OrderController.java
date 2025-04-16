package com.vishalkaushik.order_service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vishalkaushik.order_service.dto.OrderRequest;
import com.vishalkaushik.order_service.service.OrderService;

import lombok.RequiredArgsConstructor;
@RestController
@RequiredArgsConstructor

@RequestMapping("/api/order")
@CrossOrigin(origins = "*")
public class OrderController {
	
	private final OrderService orderService;
	
	@GetMapping
	public String checkApi() {
		System.out.println("Working...");
	    return "api working!";
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public String placeOrder(@RequestBody OrderRequest orderRequest) {
		orderService.placeOrder(orderRequest);
		return "Order placed successfully!";
	}

}
