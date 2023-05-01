package org.itutorials.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
public class FireArms {
	
	
	@ManyToOne
	@NotFound(action=NotFoundAction.IGNORE)
	@JoinColumn (name="USER_ID")
	private UserModel user;
	
	
	@Id
	@Column (name="SERIAL_NUMBER")
	private String serialNumber;
	@Column (name="FIRE_ARMS_NAME")
	private String fireArmsName;
	
	
	
	public UserModel getUser() {
		return user;
	}
	public void setUser(UserModel user) {
		this.user = user;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getFireArmsName() {
		return fireArmsName;
	}
	public void setFireArmsName(String fireArmsName) {
		this.fireArmsName = fireArmsName;
	}
	
	
}
