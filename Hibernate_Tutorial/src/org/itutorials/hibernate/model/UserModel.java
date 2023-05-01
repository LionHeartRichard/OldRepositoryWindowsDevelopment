package org.itutorials.hibernate.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="USER_MODEL")
public class UserModel {

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="USER_ID")
	private Collection<ProfitModel> profitModel = new ArrayList<ProfitModel>();
	
	
	@OneToOne
	@JoinColumn(name="VEHICLE_ID")
	private Vehicle vehicle;
	
	
//----------Attribute USER_MODEL-------------------	
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column (name="ID_USER")
	private int userId;
	
	@Column (name="NAME_USER")
	@Basic
	private String nameUser;
	
	@ElementCollection(fetch=FetchType.EAGER)
	private Collection<Phone> listOfPhone = new ArrayList<Phone>();
	
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride (name="street", column=@Column(name="HOME_STREET_NAME")),
		@AttributeOverride (name="city", column=@Column(name="HOME_CITY")),
		@AttributeOverride (name="state", column=@Column(name="HOME_STATE")),
		@AttributeOverride (name="pincode", column=@Column(name="HOME_PINCODE"))
	})
	private Address homeAddress;
	@Embedded
	private Address officeAddress;
	
	
	@Column(name="JOIN_DATE")
	@Temporal (TemporalType.DATE)
	private Date joinDate;
	
	@Lob	//как это работает? - тех. документацию смотри!!!
	private String description;
	
	//---------------------methods--------------------
	
	
	
	public long getUserId() {
		return userId;
	}
	

	public Collection<ProfitModel> getProfitModel() {
		return profitModel;
	}


	public void setProfitModel(Collection<ProfitModel> profitModel) {
		this.profitModel = profitModel;
	}


	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Collection<Phone> getListOfPhone() {
		return listOfPhone;
	}

	public void setListOfPhone(Collection<Phone> listOfPhone) {
		this.listOfPhone = listOfPhone;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getNameUser() {
		return nameUser;
	}
	
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
