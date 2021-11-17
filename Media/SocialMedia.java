package com.xworkz.DB.Media;

public interface SocialMedia {
	public void createProfile(long mobNumber, String name);

	public void updateProfile(String name, String newname);

	public void deleteProfile(String password);
}
