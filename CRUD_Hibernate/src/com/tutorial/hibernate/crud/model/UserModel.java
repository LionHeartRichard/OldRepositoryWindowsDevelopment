package com.tutorial.hibernate.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;
import javax.persistence.NamedQuery;


@Entity
@org.hibernate.annotations.Entity(selectBeforeUpdate=true)
@Table (name="USER_MODEL")
@NamedQuery (name="UserModel.byId", query="from UserModel where idUser = :idUser")
@NamedNativeQuery (name="sql_UserModel.byName", query="SELECT * FROM USER_MODEL WHERE NAME_USER = :nameUser", resultClass=UserModel.class)
public class UserModel {
	
	@Id @GeneratedValue
	@Column (name="ID_USER")
	private int idUser;
	
	@Column (name="NAME_USER")
	private String nameUser;
	
	
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getNameUser() {
		return nameUser;
	}
	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}
	
	
}
