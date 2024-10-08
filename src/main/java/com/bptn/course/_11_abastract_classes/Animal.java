package com.bptn.course._11_abastract_classes;

public abstract class Animal {

	// Abstract Method
	public abstract void sound();

	// Concrete Method
	public void sleep() {
		System.out.println("Animal is sleeping");
	}

}

class Dog extends Animal {
	
	@Override 
	public void sleep() {
		System.out.println("Dog is sleeping");

	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Dog BARKS");

	}

}

class Cat extends Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Cat Meow");
	}

}