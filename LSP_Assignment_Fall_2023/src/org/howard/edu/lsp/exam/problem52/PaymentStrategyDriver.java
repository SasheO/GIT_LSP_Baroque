package org.howard.edu.lsp.exam.problem52;

public class PaymentStrategyDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.setPaymentMethod(new CreditCardPayment("1234-5678-9012-3456"));
		shoppingCart.checkout(100.0);
		shoppingCart.setPaymentMethod(new PayPalPayment("user@example.com"));
		shoppingCart.checkout(50.0);
		shoppingCart.setPaymentMethod(new BitcoinPayment("user@example.com"));
		shoppingCart.checkout(75.0);
	}

}
