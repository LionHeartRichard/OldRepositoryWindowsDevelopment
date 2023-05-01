package org.localproject.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class MeleeWeapon extends Weapon {
	
	@Column (name="Damage_Type")
	private String damageType;

	public String getDamageType() {
		return damageType;
	}

	public void setDamageType(String damageType) {
		this.damageType = damageType;
	}
	
	
}
