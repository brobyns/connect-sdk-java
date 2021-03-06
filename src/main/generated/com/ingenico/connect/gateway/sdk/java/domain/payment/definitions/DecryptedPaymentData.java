/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class DecryptedPaymentData {

	private String cardholderName = null;

	private String cryptogram = null;

	private String dpan = null;

	private Integer eci = null;

	private String expiryDate = null;

	private String pan = null;

	private String paymentMethod = null;

	/**
	 * Card holder's name on the card.
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay, maps to the <span class="property">cardholderName</span> field in the encrypted payment data.
	 * <li>For Google Pay this is not available in the encrypted payment data, and can be omitted.
	 * </ul>
	 */
	public String getCardholderName() {
		return cardholderName;
	}

	/**
	 * Card holder's name on the card.
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay, maps to the <span class="property">cardholderName</span> field in the encrypted payment data.
	 * <li>For Google Pay this is not available in the encrypted payment data, and can be omitted.
	 * </ul>
	 */
	public void setCardholderName(String value) {
		this.cardholderName = value;
	}

	/**
	 * The 3D secure online payment cryptogram.
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay, maps to the <span class="property">paymentData.onlinePaymentCryptogram</span> field in the encrypted payment data.
	 * <li>For Google Pay, maps to the <span class="property">paymentMethodDetails.3dsCryptogram</span> field in the encrypted payment data.
	 * </ul>
	 * Not allowed for Google Pay if the <span class="property">paymentMethod</span> is CARD.
	 */
	public String getCryptogram() {
		return cryptogram;
	}

	/**
	 * The 3D secure online payment cryptogram.
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay, maps to the <span class="property">paymentData.onlinePaymentCryptogram</span> field in the encrypted payment data.
	 * <li>For Google Pay, maps to the <span class="property">paymentMethodDetails.3dsCryptogram</span> field in the encrypted payment data.
	 * </ul>
	 * Not allowed for Google Pay if the <span class="property">paymentMethod</span> is CARD.
	 */
	public void setCryptogram(String value) {
		this.cryptogram = value;
	}

	/**
	 * The device specific PAN.
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay, maps to the <span class="property">applicationPrimaryAccountNumber</span> field in the encrypted payment data.
	 * <li>For Google Pay, maps to the <span class="property">paymentMethodDetails.dpan</span> field in the encrypted payment data.
	 * </ul>
	 * Not allowed for Google Pay if the <span class="property">paymentMethod</span> is CARD.
	 */
	public String getDpan() {
		return dpan;
	}

	/**
	 * The device specific PAN.
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay, maps to the <span class="property">applicationPrimaryAccountNumber</span> field in the encrypted payment data.
	 * <li>For Google Pay, maps to the <span class="property">paymentMethodDetails.dpan</span> field in the encrypted payment data.
	 * </ul>
	 * Not allowed for Google Pay if the <span class="property">paymentMethod</span> is CARD.
	 */
	public void setDpan(String value) {
		this.dpan = value;
	}

	/**
	 * Electronic Commerce Indicator.
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay, maps to the <span class="property">paymentData.eciIndicator</span> field in the encrypted payment data.
	 * <li>For Google Pay, maps to the <span class="property">paymentMethodDetails.3dsEciIndicator</span> field in the encryted payment data.
	 * </ul>
	 * Not allowed for Google Pay if the <span class="property">paymentMethod</span> is CARD.
	 */
	public Integer getEci() {
		return eci;
	}

	/**
	 * Electronic Commerce Indicator.
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay, maps to the <span class="property">paymentData.eciIndicator</span> field in the encrypted payment data.
	 * <li>For Google Pay, maps to the <span class="property">paymentMethodDetails.3dsEciIndicator</span> field in the encryted payment data.
	 * </ul>
	 * Not allowed for Google Pay if the <span class="property">paymentMethod</span> is CARD.
	 */
	public void setEci(Integer value) {
		this.eci = value;
	}

	/**
	 * Expiry date of the card<br>
	 * Format: MMYY.
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay, maps to the <span class="property">applicationExpirationDate</span> field in the encrypted payment data. This field is formatted as YYMMDD, so this needs to be converted to get a correctly formatted expiry date.
	 * <li>For Google Pay, maps to the <span class="property">paymentMethodDetails.expirationMonth</span> and <span class="property">paymentMethodDetails.expirationYear</span> fields in the encrypted payment data. These need to be combined to get a correctly formatted expiry date.
	 * </ul>
	 */
	public String getExpiryDate() {
		return expiryDate;
	}

	/**
	 * Expiry date of the card<br>
	 * Format: MMYY.
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay, maps to the <span class="property">applicationExpirationDate</span> field in the encrypted payment data. This field is formatted as YYMMDD, so this needs to be converted to get a correctly formatted expiry date.
	 * <li>For Google Pay, maps to the <span class="property">paymentMethodDetails.expirationMonth</span> and <span class="property">paymentMethodDetails.expirationYear</span> fields in the encrypted payment data. These need to be combined to get a correctly formatted expiry date.
	 * </ul>
	 */
	public void setExpiryDate(String value) {
		this.expiryDate = value;
	}

	/**
	 * The non-device specific complete credit/debit card number (also know as the PAN).
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay this is not available in the encrypted payment data, and must be omitted.
	 * <li>For Google Pay, maps to the <span class="property">paymentMethodDetails.pan</span> field in the encrypted payment data.
	 * </ul>
	 * Not allowed for Google Pay if the <span class="property">paymentMethod</span> is TOKENIZED_CARD.
	 */
	public String getPan() {
		return pan;
	}

	/**
	 * The non-device specific complete credit/debit card number (also know as the PAN).
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay this is not available in the encrypted payment data, and must be omitted.
	 * <li>For Google Pay, maps to the <span class="property">paymentMethodDetails.pan</span> field in the encrypted payment data.
	 * </ul>
	 * Not allowed for Google Pay if the <span class="property">paymentMethod</span> is TOKENIZED_CARD.
	 */
	public void setPan(String value) {
		this.pan = value;
	}

	/**
	 * The type of the payment credential: either CARD or TOKENIZED_CARD.
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay this is not available in the encrypted payment data, and must be omitted.
	 * <li>For Google Pay, maps to the <span class="property">paymentMethod</span> field in the encrypted payment data.
	 * </ul>
	 */
	public String getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * The type of the payment credential: either CARD or TOKENIZED_CARD.
	 * <ul class="paragraph-width">
	 * <li>For Apple Pay this is not available in the encrypted payment data, and must be omitted.
	 * <li>For Google Pay, maps to the <span class="property">paymentMethod</span> field in the encrypted payment data.
	 * </ul>
	 */
	public void setPaymentMethod(String value) {
		this.paymentMethod = value;
	}
}
