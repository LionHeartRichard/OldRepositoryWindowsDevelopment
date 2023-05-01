package org.itutorials.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Phone {
	@Column (name="NUMBER_PHONE")
	private String numberPhone;
	@Column (name="MARK_PHONE")
	private String markPhone;
	
	public String getNumberPhone() {
		return numberPhone;
	}
	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}
	public String getMarkPhone() {
		return markPhone;
	}
	public void setMarkPhone(String markPhone) {
		this.markPhone = markPhone;
	}
	
	
}
