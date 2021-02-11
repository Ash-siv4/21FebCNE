package com.qa.day1;

public class Calc {
	// add
	public static int addStatic() {
		int a = 3;
		int b = 4;
		int c = a + b;
		return c;
	}
	
	public int addnonStatic() {
		int a = 13;
		int b = 12;
		int c = a + b;
		return c;
	}

	// arithmetic - + / * %

	public int add(int a, int b) {
		int c = a + b;
//		System.out.println(c++);
		return c;
	}

	// sub
	public int sub(int a, int b) {
		int c = a - b;
		return c;
	}

	// divide
	public int div(int a, int b) {
		int c = a / b;
		return c;
	}

	// multiply
	public int mul(int a, int b) {
		int c = a * b;
		return c;
	}

	// modulus
	public int mod(int a, int b) {
		int c = a % b; // a = 4, b=3
		return c;// c=1
	}

	// Unary operators: -- ++
	// c++ --> c = c+1
	// c-- --> c = c-1
	// c+= a --> c = c+a
	// c-= a --> c = c-a

	// boolean
	public boolean bool(int a, int b) {
		int c = a+b;
		return true;
	}
}
