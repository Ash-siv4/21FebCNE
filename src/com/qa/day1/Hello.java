package com.qa.day1;

public class Hello {
	
	static String word = "hello world";
//	int num = 30;
//	char let = 'h';
//	float dec = 12.67f;
//	double int_dec = 14.56;
//	long long_num = 344444444;
//	boolean bool = true;

	//void return type so no "return" needed
	public static void HelloWorld() {
		System.out.println(word);
	}

	//int return type so needs an integer returned
	public static int intType() {
		return 0;//int value returned
	}
	
	//String return type so needs a string returned
	public static String stringType() {
		return "hi";//the string returned
	}
}
