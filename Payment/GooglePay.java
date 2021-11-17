package com.xworkz.DB.Payment;

public class GooglePay implements OnlinePayment {

	public void MobileRecharge(long number, int amount) {
		System.out.println("recharge done with googlepay");
	}

	public void ElectricityBillPayment(String id, int amount) {
		System.out.println("electricity bill payment done  with googlepay");
	}

	public void CreditCardPayment(long cardNumber, double amount) {
		System.out.println("credit card payment done  with googlepay");
	}

}
