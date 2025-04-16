package com.vishalkaushik.inventoryservice.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vishalkaushik.inventoryservice.dto.InventryResponse;
import com.vishalkaushik.inventoryservice.repository.InventryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventryService {
	private final InventryRepository inventryRepository;
	
	@Transactional(readOnly=true)
	public List<InventryResponse> isInStock(List<String> skuCode) {
		return inventryRepository.findBySkuCodeIn(skuCode)
				.stream()
				.map(inventry ->
					InventryResponse.builder()
					.skuCode(inventry.getSkuCode())
					.isInStock(inventry.getQuantity()>0)
					.build()
				).toList();
	}
}
