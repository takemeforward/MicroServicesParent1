package com.vishalkaushik.inventoryservice.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vishalkaushik.inventoryservice.model.Inventry;

@Repository
public interface InventryRepository extends JpaRepository<Inventry, Long>{	
	List<Inventry> findBySkuCodeIn(List<String> skuCode);
}
