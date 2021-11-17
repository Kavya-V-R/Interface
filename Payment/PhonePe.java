package com.xworkz.DB.Payment;

public class PhonePe implements OnlinePayment {

	public void MobileRecharge(long number, int amount) {
		System.out.println("mobile recharge done with phonepe");
	}

	public void ElectricityBillPayment(String id, int amount) {
		System.out.println("electricity bill payment done with phonepe");
	}

	public void CreditCardPayment(long cardNumber, double amount) {
		System.out.println("credit card payment done with phonepe ");
	}

}
