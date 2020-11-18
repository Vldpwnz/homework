package com.vladyslav.webapp.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Pick_Up_Module")
public class PickUpModule extends Module {

	@Column(name = "capacity_in_sq_meters")
	private Double capacityInSqMeters;

	public PickUpModule() {
	
	}

	public PickUpModule(String name, Double costInEuro, Double capacityInSqMeters) {
		super(name, costInEuro);
		this.capacityInSqMeters = capacityInSqMeters;
	}



	public Double getCapacityInSqMeters() {
		return capacityInSqMeters;
	}

	public void setCapacityInSqMeters(Double capacityInSqMeters) {
		this.capacityInSqMeters = capacityInSqMeters;
	}
	
	

	
	
}
