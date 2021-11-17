package com.xworkz.DB.Shopping;

public class OnlineShoppingTester {
	public static void main(String[] args) {
		Mintra mintra = new Mintra();
		mintra.login("kavya@gmail.com", "kavu");
		mintra.placeOrder("tumkur");
		mintra.logout();
	}
}
