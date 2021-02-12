package com.qa.day3.Inheritance;

public class Parent extends Grandparent {

	// this parent class inherits from grandparent

	private String lastname;
	private String haircolour;
	private String eyecolour;

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getHaircolour() {
		return haircolour;
	}

	public void setHaircolour(String haircolour) {
		this.haircolour = haircolour;
	}

	public String getEyecolour() {
		return eyecolour;
	}

	public void setEyecolour(String eyecolour) {
		this.eyecolour = eyecolour;
	}

	private void sleep() {
		System.out.println("sleeping");
	}

}
