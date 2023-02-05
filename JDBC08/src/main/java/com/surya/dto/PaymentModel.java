package com.surya.dto;

public class PaymentModel {

	private Long cardNumber;
	private String name;
	private String cardType;
	private int cvv;
	private int expiryMM;
	private int expiryYY;

	public Long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public int getExpiryMM() {
		return expiryMM;
	}

	public void setExpiryMM(int expiryMM) {
		this.expiryMM = expiryMM;
	}

	public int getExpiryYY() {
		return expiryYY;
	}

	public void setExpiryYY(int expiryYY) {
		this.expiryYY = expiryYY;
	}

}
