package com.vishalkaushik.inventoryservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vishalkaushik.inventoryservice.dto.InventryResponse;
import com.vishalkaushik.inventoryservice.service.InventryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/inventry")
@RequiredArgsConstructor
public class InventryController {
	private final InventryService inventryService;

// http://localhost:8085/api/inventry/iphone-13, iphone13-red // sending kruCode through @PathVariable
// http://localhost:8085/api/inventry?sku-code=iphone-13&skuCode=iphone13-red // sending kruCode through @RequestParam

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<InventryResponse> isInStock(@RequestParam List<String> skuCode) {
		return inventryService.isInStock(skuCode);
	}
}
