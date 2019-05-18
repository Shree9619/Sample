package com.passport.model;

public class CardPayment implements Payment {
	
	private String nameOnTheCard;
	private Long cardNumber;
	private String expiryDate;
	private Integer cvv;
	
	public CardPayment()
	{
		
	}

	public CardPayment(String nameOnTheCard, Long cardNumber, String expiryDate, Integer cvv) {
		super();
		this.nameOnTheCard = nameOnTheCard;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
	}

	public String getNameOnTheCard() {
		return nameOnTheCard;
	}

	public void setNameOnTheCard(String nameOnTheCard) {
		this.nameOnTheCard = nameOnTheCard;
	}

	public Long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Integer getCvv() {
		return cvv;
	}

	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}

	
}
