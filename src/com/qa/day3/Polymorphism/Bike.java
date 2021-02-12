package com.qa.day3.Polymorphism;

public class Bike extends Vehicle {

	//constructor made from the attributes in the parent class
	public Bike(String make, int doors, int seats, int cylinders) {
		super(make, doors, seats, cylinders);
		// TODO Auto-generated constructor stub
	}

	//same method in the parent class of vehicle but implemented differently here
	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("2");
	}

}
