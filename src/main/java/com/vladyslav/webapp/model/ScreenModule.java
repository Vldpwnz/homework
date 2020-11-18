package com.vladyslav.webapp.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Screen")
public class ScreenModule extends Module {
	
	@Column(name = "diagonal")
	private Double diagonal;
	
	public ScreenModule() {
	
	}
	

	public ScreenModule(String name, Double costInEuro, Double diagonal) {
		super(name, costInEuro);
		this.diagonal = diagonal;
	}


	public Double getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(Double diagonal) {
		this.diagonal = diagonal;
	}
	
	
	
	

}
