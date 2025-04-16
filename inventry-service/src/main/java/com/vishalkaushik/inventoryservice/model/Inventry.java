package com.vishalkaushik.inventoryservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="t_inventry")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Inventry {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inventory_seq")
	@SequenceGenerator(name = "inventory_seq", sequenceName = "inventory_seq", allocationSize = 1)	private Long id;
	private String skuCode;
	private Integer quantity;
}
