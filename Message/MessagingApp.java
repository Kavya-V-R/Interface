package com.xworkz.DB.Message;

public interface MessagingApp {
	public void createAccount(long mobNumber, int OTP);

	public void addStory();

	public void deleteAccount(long mobNumber);
}
