package org.localproject.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class TwoWheelerModel extends ModelVehicle {
	
	@Column (name="STEERING_HANDLE")
	private String steeringHandle;

	public String getSteeringHandle() {
		return steeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		this.steeringHandle = steeringHandle;
	}
	
	
}
