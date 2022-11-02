package main;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	//Overriding = sama tapi beda class
	public void sound() {
		System.out.println("Cat bersuara");
	}
	
	//overloading
	public void sound(String name) {
		System.out.println(name + " bersuara");
	}
	
	public void CatUnique() {
		System.out.println("Cat Unique");
	}

}
