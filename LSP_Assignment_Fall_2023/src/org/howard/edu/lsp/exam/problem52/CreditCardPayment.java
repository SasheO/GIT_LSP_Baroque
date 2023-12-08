package org.howard.edu.lsp.exam.problem52;

public class CreditCardPayment implements PaymentStrategy {
	String creditCardNo;

	@Override
	public void pay(double pay) {
		// TODO Auto-generated method stub
		System.out.println("Paid "+pay+" using credit card " + this.creditCardNo);
		
	}
	
	public CreditCardPayment(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

}
