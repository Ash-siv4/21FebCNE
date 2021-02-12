package com.qa.day3;

public class Person {
	
	//Class constructors
	
	public String name = "";
	private int age;
	public double height;
	public float weight;
	
	
	public Person(String name, int age, double height, float weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}


	public Person(int age, double height, float weight) {
		super();
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public void sleep() {
		
	}
	
}
