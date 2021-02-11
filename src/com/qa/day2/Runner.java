package com.qa.day2;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arrays a = new Arrays();
		a.print();
		a.arrayList();

		Loops l = new Loops();
		l.forloop(23);
		l.whileLoop();
		l.doWhile();

		FlowEx f = new FlowEx();
		f.flow(3340);

		Conditionals x = new Conditionals();
		x.temp(30);
		x.switchCase("tuesday");

		// compare strings with .equals
		String str = "hi";
		String str1 = "hello" + str;
		str.equals(str1);

	}

}
