package tutorial.hibernate.projection.api.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="USER_MODEL")
public class UserModel {
	
	@Id @GeneratedValue
	@Column (name="USER_ID")
	private int userId;
	
	@Column (name="NUMBER_PHONE")
	private String numberPhone;
	
	@Column (name="NAME_USER")
	private String nameUser;
	
	@Column (name="SURNAME_USER")
	private String surnameUser;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getSurnameUser() {
		return surnameUser;
	}

	public void setSurnameUser(String surnameUser) {
		this.surnameUser = surnameUser;
	}
	
	
	
}
