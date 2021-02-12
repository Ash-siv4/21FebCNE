package com.qa.day3.Abstract;

public abstract class Abstract extends Abstract0 {
	// abstract classes can inherit from other abstract classes
	// an abstract class can have abstract and non-abstract methods

	// abstract methods
	abstract void create();

	abstract void read();

	abstract void update();

	abstract void delete();

	// non-abstract method
	public void hello() {
		System.out.println("helloworld");
	}

}
