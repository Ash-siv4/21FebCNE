package com.qa.day2;

public class Conditionals {
	// Equality OPERATORS:
	// >=
	// <=
	// ==
	// !=
	// >
	// <
	// Conditional OPERATORS:
	// Bitwise OR - | 
	// Logical OR - || 
	// Logical AND - && 
	// Bitwise AND - &

	public void temp(int t) {
//		if(t>24 && t<30) {//24>=24
//			System.out.println("hot");
//		}else if(t>24 && t>30) {
//			System.out.println("really hot");
//		}else if(t==24){
//			System.out.println("perfect");
//		}else {
//			System.out.println("cold");
//		}

		if (t > 24) {// 24>=24
			System.out.println("hot");
			if (t >= 30) {
				System.out.println("really hot");
			} else {
				System.out.println("not too hot");
			}
		} else if (t == 24) {
			System.out.println("perfect");
		} else {
			System.out.println("cold");
		}
	}

	public void switchCase(String day) {
		switch (day.toLowerCase()) {
		case "monday":
			System.out.println("mondays suck");
			break;
		case "tuesday":
			System.out.println("day 2");
			break;
		case "wednesday":
			System.out.println("yesterday");
			break;
		case "thursday":
			System.out.println("today");
			break;
		case "friday":
			System.out.println("yaay");
			break;
		default:
			System.out.println("not a day");
			break;
		}
		
	}

}
