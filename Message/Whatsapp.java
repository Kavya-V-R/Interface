package com.xworkz.DB.Message;

public class Whatsapp implements MessagingApp {

	public void createAccount(long mobNumber, int OTP) {
		System.out.println("whatsapp account created");
	}

	public void addStory() {
		System.out.println("status uploaded");
	}

	public void deleteAccount(long mobNumber) {
		System.out.println("whatsapp account delete");
	}

}
