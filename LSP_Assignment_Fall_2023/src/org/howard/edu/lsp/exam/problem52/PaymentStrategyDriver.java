package org.howard.edu.lsp.exam.problem52;

public class PaymentStrategyDriver {


	
	public static void main(String[] args) {
	ShoppingCart shoppingCart = new ShoppingCart();
	shoppingCart.setPaymentMethod(new PayPalPayment("user@example.com"));
	shoppingCart.checkout(50.0);
	shoppingCart.setPaymentMethod(new PayPalPayment("user@example.com"));
	shoppingCart.checkout(50.0);
	shoppingCart.setPaymentMethod(new PayPalPayment("user@example.com"));
	shoppingCart.checkout(50.0);
	}

}
