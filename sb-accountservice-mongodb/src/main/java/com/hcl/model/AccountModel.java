package com.hcl.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "accounts")
public class AccountModel {
	@Id
	private String accNo;
	private String accName;
	private double amount;
	private String currency;

	public AccountModel() {

	}

	public AccountModel(String accNo, String accName, double amount,
						String currency) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.amount = amount;
		this.currency = currency;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
