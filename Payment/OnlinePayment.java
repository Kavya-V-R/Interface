package com.xworkz.DB.Payment;

public interface OnlinePayment {
	public void MobileRecharge(long number, int amount);

	public void ElectricityBillPayment(String id, int amount);

	public void CreditCardPayment(long cardNumber, double amount);
}
