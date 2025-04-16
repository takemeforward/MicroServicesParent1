package com.vishalkaushik.inventoryservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.vishalkaushik.inventoryservice.model.Inventry;
import com.vishalkaushik.inventoryservice.repository.InventryRepository;

@SpringBootApplication
@EnableEurekaClient
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);	
	}
	
	@Bean
	public CommandLineRunner loadData(InventryRepository inventryRepository) {
		return args ->{
			Inventry inventry = new Inventry();
			inventry.setSkuCode("iPhone_13");
			inventry.setQuantity(100);
			
			Inventry inventry1 = new Inventry();
			inventry1.setSkuCode("iPhone_13_red");
			inventry1.setQuantity(0);
			
			inventryRepository.save(inventry);
			inventryRepository.save(inventry1);
		};
	}

}
