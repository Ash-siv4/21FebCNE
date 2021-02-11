package com.qa.solutions;

public class Runner {
	public static void main(String[] args) {
		
		NumbersEx num = new NumbersEx();
		System.out.println(num.add2Dig(23));
		System.out.println(num.stringRep(4342));
		num.one2hund();

		CoinsEx test = new CoinsEx();
		test.change(4.58, 20);
		
	}
}
