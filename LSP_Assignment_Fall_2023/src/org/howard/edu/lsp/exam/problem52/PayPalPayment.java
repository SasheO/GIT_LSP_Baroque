package org.howard.edu.lsp.exam.problem52;

public class PayPalPayment implements PaymentStrategy{
	String emailAddress;

	public PayPalPayment(String emailAddress) {
		// TODO Auto-generated constructor stub
		this.emailAddress = emailAddress;
	}

	@Override
	public void pay(double pay) {
		// TODO Auto-generated method stub
		System.out.println("Paid "+pay+" using credit card " + this.emailAddress);
	}

}
