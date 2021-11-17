package com.xworkz.DB.Payment;

public class OnlinePaymentTester {
	public static void main(String[] args) {
		PhonePe phonePe = new PhonePe();
		phonePe.MobileRecharge(7026756387l, 399);
		phonePe.ElectricityBillPayment("BES122", 550);
		phonePe.CreditCardPayment(1234567890l, 26000.36);

	}
}
