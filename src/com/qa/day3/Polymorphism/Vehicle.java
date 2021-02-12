package com.qa.day3.Polymorphism;

public class Vehicle {
	//attributes
	String make;
	int doors;
	int seats;
	int cylinders;

	//constructor
	public Vehicle(String make, int doors, int seats, int cylinders) {
		super();
		this.make = make;
		this.doors = doors;
		this.seats = seats;
		this.cylinders = cylinders;
	}

	//method
	public void wheels() {
		System.out.println("10");
	};
}
