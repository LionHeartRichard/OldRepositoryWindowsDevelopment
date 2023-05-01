package org.localproject.main.model;

import javax.persistence.Entity;

@Entity
public class FireArms extends Weapon {
	
	private String caliber;

	public String getCaliber() {
		return caliber;
	}

	public void setCaliber(String caliber) {
		this.caliber = caliber;
	}
	
	
}
