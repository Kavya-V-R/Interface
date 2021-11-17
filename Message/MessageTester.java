package com.xworkz.DB.Message;

public class MessageTester {

	public static void main(String[] args) {
		Messenger messenger = new Messenger();
		messenger.createAccount(7026756387l, 123456);
		messenger.addStory();
		messenger.deleteAccount(7026756387l);
	}

}
