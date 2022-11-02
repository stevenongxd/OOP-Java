package main;

public class Animal {
	
	String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	//Overriding = sama tapi beda class
	public void sound() {
		System.out.println("Animal bersuara");
	}
	
	public void AnimalUnique() {
		System.out.println("Animal Unique");
	}

}
