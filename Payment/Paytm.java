package com.xworkz.DB.Payment;

public class Paytm implements OnlinePayment {

	public void MobileRecharge(long number, int amount) {
		System.out.println("recharge successfel with paytm");
	}

	public void ElectricityBillPayment(String id, int amount) {
		System.out.println("electricity bill payment successful with paytm");
	}

	public void CreditCardPayment(long cardNumber, double amount) {
		System.out.println("credit card payment successful with paytm");
	}

}
