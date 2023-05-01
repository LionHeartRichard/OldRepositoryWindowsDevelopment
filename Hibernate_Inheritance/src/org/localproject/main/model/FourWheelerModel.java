package org.localproject.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class FourWheelerModel extends ModelVehicle {
	
	@Column (name="STEERING_WHEEL")
	private String steeringWheel;

	
	public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}
	
	
}
