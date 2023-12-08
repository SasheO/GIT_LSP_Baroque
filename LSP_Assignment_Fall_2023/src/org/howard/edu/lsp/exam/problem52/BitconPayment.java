package org.howard.edu.lsp.exam.problem52;

public class BitconPayment implements PaymentStrategy{
	String bitcoinAddress;
	
	public BitconPayment(String bitcoinAddress) {
		// TODO Auto-generated constructor stub
		this.bitcoinAddress = bitcoinAddress;
	}

	@Override
	public void pay(double pay) {
		// TODO Auto-generated method stub
		System.out.println("Paid "+pay+" using credit card " + this.bitcoinAddress);
	}

}
