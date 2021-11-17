package com.xworkz.DB.Shopping;

public class Meesho implements OnlineShopping {

	public void login(String mailid, String password) {
		System.out.println("meesho login");
	}

	public void placeOrder(String address) {
		System.out.println("order placed");
	}

	public void logout() {
		System.out.println("meesho logout");
	}

}
