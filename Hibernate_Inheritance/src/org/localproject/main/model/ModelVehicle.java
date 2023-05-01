package org.localproject.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="MODEL_VEHICLE")
public class ModelVehicle {
	
	@Id @GeneratedValue
	@Column (name="VEHICLE_ID")
	private int vehicleId;
	
	@Column (name="NAME_VEHICLE")
	private String nameVehicle;


	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getNameVehicle() {
		return nameVehicle;
	}

	public void setNameVehicle(String nameVehicle) {
		this.nameVehicle = nameVehicle;
	}
	
	
	
}
