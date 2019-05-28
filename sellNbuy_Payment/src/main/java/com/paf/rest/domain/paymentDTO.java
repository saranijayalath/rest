package com.paf.rest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payments")
public class paymentDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "payment_id")
	private Integer id;
	
	@Column(name = "method")
	private String paymentMethod;
	
	@Column(name = "card_Type")
	private String cType;
	
	@Column(name = "bank")
	private String paidBank;
	
	@Column(name = "amount")
	private Float amount;
	
	@Column(name = "accountNumber")
	private Integer account;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getcType() {
		return cType;
	}
	public void setcType(String cType) {
		this.cType = cType;
	}
	public String getPaidBank() {
		return paidBank;
	}
	public void setPaidBank(String paidBank) {
		this.paidBank = paidBank;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public Integer getAccount() {
		return account;
	}
	public void setAccount(Integer account) {
		this.account = account;
	}
	
	
	
}
