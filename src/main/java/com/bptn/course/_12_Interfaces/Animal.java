package com.bptn.course._12_Interfaces;

interface Animal {
	
	// it can only have abstract method 
	// When we need multiple inheritance / extensions 
	// A class can extends 1 class and implements multiple interface 
	void sound();

}

interface Pet {
	void play();
}

class Dog implements Animal,Pet {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Woof Woof");
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("dog is barking");
		
	}
	
}