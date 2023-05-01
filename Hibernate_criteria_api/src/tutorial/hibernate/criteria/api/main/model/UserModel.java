package tutorial.hibernate.criteria.api.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@org.hibernate.annotations.Entity(selectBeforeUpdate=true)
@Table (name="USER_MODEL")
public class UserModel {

	@Id @GeneratedValue
	@Column (name="USER_ID")
	private int userId;
	
	@Column (name="SURNAME_USER")
	private String surnameUser;
	
	@Column (name="NAME_USER")
	private String nameUser;
	
	@Column (name="NAMBER_PHONE")
	private String namberPhone;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getSurnameUser() {
		return surnameUser;
	}

	public void setSurnameUser(String surnameUser) {
		this.surnameUser = surnameUser;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getNamberPhone() {
		return namberPhone;
	}

	public void setNamberPhone(String namberPhone) {
		this.namberPhone = namberPhone;
	}
	
	
	
}
