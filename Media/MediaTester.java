package com.xworkz.DB.Media;

public class MediaTester {
	public static void main(String[] args) {
		Facebook facebook = new Facebook();
		facebook.createProfile(7026756387l, "kavya");
		facebook.updateProfile("kavya", "kavya V R");
		facebook.deleteProfile("kavya1998");
	}
}
