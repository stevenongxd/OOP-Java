package main;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	//Overriding = sama tapi beda class
	public void sound() {
		System.out.println("Dog bersuara");
	}

	//overloading
	public void sound(String name) {
		System.out.println(name + " bersuara");
	}
	
	public void DogUnique() {
		System.out.println("Dog Unique");
	}
}
