/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AbstractPaymentMethodSpecificInput;

public class MobilePaymentMethodSpecificInputHostedCheckout extends AbstractPaymentMethodSpecificInput {

	private MobilePaymentProduct320SpecificInputHostedCheckout paymentProduct320SpecificInput = null;

	/**
	 * Object containing information specific to Google Pay
	 */
	public MobilePaymentProduct320SpecificInputHostedCheckout getPaymentProduct320SpecificInput() {
		return paymentProduct320SpecificInput;
	}

	/**
	 * Object containing information specific to Google Pay
	 */
	public void setPaymentProduct320SpecificInput(MobilePaymentProduct320SpecificInputHostedCheckout value) {
		this.paymentProduct320SpecificInput = value;
	}
}
