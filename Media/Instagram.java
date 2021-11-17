package com.xworkz.DB.Media;

public class Instagram implements SocialMedia {

	public void createProfile(long mobNumber, String name) {
		System.out.println("insta profile crceated");
	}

	public void updateProfile(String name, String newname) {
		System.out.println("insta profile updated");
	}

	public void deleteProfile(String password) {
		System.out.println("insta profile deleted");
	}

}
