package com.qa.day2;

import java.util.ArrayList;

public class Arrays {

	// ------------------------------------ Arrays ------------------------------------

	// single - dimensional
	// 0 1 2 3 4
	int[] age = { 18, 19, 34, 24, 26 };
	String[] letters = { "a", "b", "c", "d", "e" };
	// col 0 1 2 3 4
	// 18 19 34 24 26

	// multi - dimensional
	int[][] age2 = {{18, 19, 34, 24, 26},{2, 5, 64, 23, 21}}; 
	// col 0 1 2 3 4
	// row0 18 19 34 24 26
	// row1 2 5 64 23 21
	// [row][col]

	public void print() {
		System.out.println(age2[0][0]);// print the value at row0 col0 in array age2
		
		// -------------------------------- Normal for-loop --------------------------------
		for(int count=0;count<age.length;count++) {
			System.out.println(age[count]);
			System.out.println(letters[count]);
		}
		// -------------------------------- Enhanced for-loop --------------------------------
		for (int a : age) {
			System.out.println(a);
		}
	}
	
	
	
	// ------------------------------------ Array Lists ------------------------------------

	public void arrayList() {
		//create an array with name: arrl
		ArrayList<Integer> arrl = new ArrayList<>();
		//another array with name: list
		ArrayList<Integer> list = new ArrayList<>();
		//add value 4 to the array: arrl
		arrl.add(4);// has index of 0
		System.out.println(arrl.size());// check how many numbers are currently in array: arrl
		//add more values to the array: arrl
		arrl.add(45);// has index of 1
		arrl.add(75);// has index of 2
		arrl.add(34);// has index of 3
		System.out.println(arrl.size());// again check how many numbers in the array: arrl
		arrl.remove(0);// remove the vale at index 0 from the array: arrl (value 4 removed)
		arrl.clear();// empties the array, deletes everything in it
		System.out.println(arrl.get(2));// get the value at index 2 and print it

	}

}
