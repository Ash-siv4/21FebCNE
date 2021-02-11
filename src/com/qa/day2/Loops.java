package com.qa.day2;

public class Loops {

	// for(initialisation;condition;iteration)
	public void forloop(int inp) {
		for (int count = 0; count < inp; count++) {
			System.out.println(count);
		}
	}

	// while - if you don't know the end point
	
	public void whileLoop() {
		System.out.println("-------- While -----------");
		int count = 3;
		while(count<3) {//3<3 - false
			count++;
			System.out.println(count);
		}
	}

	// do-while
	public void doWhile() {
		System.out.println("-------- doWhile -----------");
		int count = 3;
		do {
			count++;
			System.out.println(count);
		}while(count<3);//3<3
	}

}
