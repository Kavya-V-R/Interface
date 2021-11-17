package com.xworkz.DB.Message;

public class Messenger implements MessagingApp {

	public void createAccount(long mobNumber, int OTP) {
		System.out.println("messenger account created");
	}

	public void addStory() {
		System.out.println("story added");
	}

	public void deleteAccount(long mobNumber) {
		System.out.println("messenger account deleted");
	}

}
