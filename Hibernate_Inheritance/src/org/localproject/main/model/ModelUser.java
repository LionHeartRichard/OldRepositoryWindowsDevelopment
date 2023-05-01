package org.localproject.main.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="MODEL_USER")
public class ModelUser {
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="FOREIGEN_ID_USER")
	private Collection<ModelVehicle> foreignIdUser = new ArrayList<ModelVehicle>(); 
	
	@Id @GeneratedValue
	@Column (name="USER_ID")
	private int userId;
	
	@Column (name="USER_NAME")
	private String userName;
	
	
	
	public Collection<ModelVehicle> getForeignIdUser() {
		return foreignIdUser;
	}
	public void setForeignIdUser(Collection<ModelVehicle> foreignIdUser) {
		this.foreignIdUser = foreignIdUser;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}
