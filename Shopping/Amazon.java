package com.xworkz.DB.Shopping;

public class Amazon implements OnlineShopping {

	public void login(String mailid, String password) {
		System.out.println("login to amazon");
	}

	public void placeOrder(String address) {
		System.out.println("order plced at amazon");
	}

	public void logout() {
		System.out.println("logout from amazon");
	}

}
