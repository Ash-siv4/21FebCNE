package com.qa.day3;

import com.qa.day3.Encapsulation.Customer;
import com.qa.day3.Inheritance.Child;
import com.qa.day3.Polymorphism.Car;

public class Runner {

	public static void main(String[] args) {

		// -------------------------- Polymorphism --------------------------

		Car audi = new Car(null, 0, 0, 0, null);
		audi.method(1, 2);

		// -------------------------- Inheritance --------------------------

		Child chi = new Child();
		chi.eat();

		// -------------------------- Encapsulation --------------------------

		Customer x = new Customer();
		x.setAccno(1234);
		System.out.println(x.getAccno());
		x.setAccno(7543);
		System.out.println(x.getAccno());

		// -------------------------- Constructors --------------------------

		Person bob = new Person("bob", 10, 25, 45);
		Person jane = new Person("jane", 10, 25, 45);

		// -------------------------- String Manipulation --------------------------

		// 012345
		String str = "Eeyore";
		System.out.println(str.length());// 6
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.indexOf("e"));// 2
		System.out.println(str.contains("ey"));// true
		System.out.println(str.charAt(3));// o
		System.out.println(str.endsWith("r"));// false
		// inclusive - begin index, exclusive - end index
		System.out.println(str.substring(1, 3));// ey
		System.out.println(str.substring(2));// yore

		String str1 = "Eeyore";
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		// compares strings lexicographically
		System.out.println(str.compareTo(str1));
	}
}
