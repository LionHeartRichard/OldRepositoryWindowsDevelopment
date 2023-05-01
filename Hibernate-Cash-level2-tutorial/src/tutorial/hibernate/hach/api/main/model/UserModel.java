package tutorial.hibernate.hach.api.main.model;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
@org.hibernate.annotations.Entity(selectBeforeUpdate=true)
public class UserModel {

		@Id @GeneratedValue(strategy=GenerationType.AUTO)
		@Column (name="user_id")
		private int userId;
		@Column (name="surname_user")
		private String surnameUser;
		@Column (name="name_user")
		private String nameUser;
		@Column (name="number_phone")
		private String phoneUser;
		
		
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
		public String getPhoneUser() {
			return phoneUser;
		}
		public void setPhoneUser(String phoneUser) {
			this.phoneUser = phoneUser;
		}
		
		
}
