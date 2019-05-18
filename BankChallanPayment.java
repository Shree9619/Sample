package com.passport.model;

public class BankChallanPayment implements Payment {
	private Long challanNumber;
	public BankChallanPayment()
	{
		
	}
	public BankChallanPayment(Long challanNumber) {
		super();
		this.challanNumber = challanNumber;
	}
	public Long getChallanNumber() {
		return challanNumber;
	}
	public void setChallanNumber(Long challanNumber) {
		this.challanNumber = challanNumber;
	}
	
}
