package com.qa.day3.Abstract;

public class UseAbstract extends Abstract {

	// when inheriting from an abstract class, if there are abstract methods, they
	// need to be implemented - need to write code in the body of the method

	@Override
	void create() {
		// TODO Auto-generated method stub

	}

	@Override
	void read() {
		// TODO Auto-generated method stub

	}

	@Override
	void update() {
		// TODO Auto-generated method stub

	}

	@Override
	void delete() {
		// TODO Auto-generated method stub

	}
	
	//this method is inherited from Abstract which inherits from Abstract0
	@Override
	void abc() {
		// TODO Auto-generated method stub
		
	}

	// Note: the non-abstract method in the Abstract class is not implemented here
	// but when you call the UseAbstract in the Runner, you can run the non-abstract
	// method of 'hello'

}
