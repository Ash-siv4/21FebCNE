package com.qa.day1;

public class ResultsEx {

	private int Phys;
	int Chem;
	int Bio;
	
	

	public int getPhys() {
		return Phys;
	}

	public void setPhys(int phys) {
		Phys = phys;
	}

	public ResultsEx(int phys, int chem, int bio) {
		super();
		this.Phys = phys;
		Chem = chem;
		Bio = bio;
	}

	public int totalMarks() {
		System.out.println("Physics mark: " + Phys);
		System.out.println("Chemistry mark: " + Chem);
		System.out.println("Biology mark: " + Bio);
		int sumTotal = Phys + Chem + Bio;
		System.out.println("Total mark: " + sumTotal);
		return sumTotal;
	}

	public int percentMarks() {
		int percent = (totalMarks() * 100) / 450;
		System.out.println("Percentage total: " + percent + "%");
		return percent;
	}

//	public returntype methodname(datatype variablename,etc) {
//		
//	}

	static int a = 4;

}
