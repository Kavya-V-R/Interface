package com.xworkz.DB.Media;

public class Facebook implements SocialMedia {

	public void createProfile(long mobNumber, String name) {
		System.out.println("facebook profile created");
	}

	public void updateProfile(String name, String newname) {
		System.out.println("facebook profile updated");
	}

	public void deleteProfile(String password) {
		System.out.println("facebook profile deleted");
	}

}
