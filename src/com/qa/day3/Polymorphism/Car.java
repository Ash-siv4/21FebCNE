package com.qa.day3.Polymorphism;

public class Car extends Vehicle {

	String reg;

	public Car(String make, int doors, int seats, int cylinders, String reg) {
		super(make, doors, seats, cylinders);
		this.reg = reg;
	}

	// method overloading - same method name but different number of parameters
	// passed into the method
	public void method(int a) {
		System.out.println("1 parameter");
	}

	public void method() {
		System.out.println("no parameters");
	}

	public void method(int a, int b) {
		System.out.println("2 parameters");
	}

	public void method(int a, int b, int c) {
		System.out.println("3 parameters");
	}

	// method overriding - child class methods overrides methods from the parent
	// class if the methods have the same name
	// ***Note the @Override annotation
	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("4");
	}

}
