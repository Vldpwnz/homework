package com.vladyslav.webapp.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
		name ="MODULE_TYPE"
)
public abstract class Module {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "cost_in_euro")
	private Double costInEuro;
	
	@Column(name = "name")
	private String name;
	
	
	
	public Module() {
		
	}

	public Module(String name, Double costInEuro) {
		this.costInEuro = costInEuro;
		this.name = name;
	}

	public Double getCostInEuro() {
		return costInEuro;
	}

	public void setCostInEuro(Double costInEuro) {
		this.costInEuro = costInEuro;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}
	
	
	
	
	
	
	

}
