package com.qa.day1;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//-------------------------- Calc class ----------------------------
		Calc adding = new Calc();
		System.out.println("ADD: " + adding.add(20, 10));
		System.out.println("SUB: " + adding.sub(20, 10));
		System.out.println("MUL: " + adding.mul(20, 10));
		System.out.println("DIV: " + adding.div(20, 10));
		System.out.println("MOD: " + adding.mod(20, 10));

		//-------------------------- Scanner ----------------------------
		// to get user inputs
		Scanner sc = new Scanner(System.in);
		// enter values
		int input = sc.nextInt();
		int input2 = sc.nextInt();
		adding.add(input, input2);

		//-------------------------- ResultsEx class ----------------------------
		
		ResultsEx bob = new ResultsEx(10, 30, 50);
		bob.totalMarks();
		bob.percentMarks();
		System.out.println("----------------------------------");
		ResultsEx tony = new ResultsEx(56, 343, 3);
		tony.totalMarks();
		tony.percentMarks();

		//-------------------------- Static vs Non-static ----------------------------
		
		// sysout then ctr + space
		System.out.println("Hello world");

		// static
		Hello.HelloWorld();

		System.out.println(Calc.addStatic());

		// non-static
		Calc add = new Calc();
		System.out.println(add.addnonStatic());

	}
}
