package org.itutorials.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ProfitModel {
	
	@ManyToOne
	private UserModel user;
	
	@Id @GeneratedValue
	@Column (name="PROFIT_ID")
	private long profitId;
	@Column (name="PROFIT_NAME")
	private String profitName;
	@Column (name="AMOUNT_PROFIT")
	private long amountProfit;
	
	
	
	
	public UserModel getUser() {
		return user;
	}
	public void setUser(UserModel user) {
		this.user = user;
	}
	public long getProfitId() {
		return profitId;
	}
	public void setProfitId(long profitId) {
		this.profitId = profitId;
	}
	public String getProfitName() {
		return profitName;
	}
	public void setProfitName(String profitName) {
		this.profitName = profitName;
	}
	public long getAmountProfit() {
		return amountProfit;
	}
	public void setAmountProfit(long amountProfit) {
		this.amountProfit = amountProfit;
	}
	
	
}
