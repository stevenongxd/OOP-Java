package main;

import java.util.Iterator;
import java.util.Vector;

public class Main {

	//Overloading = method sama tapi parameter beda di class yang sama 
	public void sum(Integer a, Integer b) {
		System.out.println("Hasil sum: " + (a + b));
	}
	
	public void sum(Float a, Float b) {
		System.out.println("Hasil sum: " + (a + b));
	}

	public void sum(Integer a, Integer b, Integer c) {
		System.out.println("Hasil sum: " + (a + b + c));
	}
	
	public Main() {
		sum(3, 4);	
		sum(4.5f, 7.9f);
		sum(1, 2, 3);
		
		System.out.println();
		
		Cat cat1 = new Cat("Timo");
		cat1.sound();
		cat1.sound(cat1.name);
		
		System.out.println();
		
		Dog dog1 = new Dog("Tomi");
		dog1.sound();
		dog1.sound(dog1.name);
		
		//parent = animal
		//child = cat/dog
		
		// upcasting
		// cuma bisa mengambil method/atribut yang ada di parent class
		Animal animal1 = new Dog("Toni");
		animal1.AnimalUnique();
		
		//downcast
		// method/atribut yang ada di child & parent bisa di ambil
		Dog dog2 = (Dog)animal1;
		dog2.AnimalUnique();
		dog2.DogUnique();
		
		Vector<Animal> animals = new Vector<>();
		animals.add(dog1);
		animals.add(cat1);
		animals.add(dog2);
		
		for (Animal animal : animals) {
			if(animal instanceof Dog) {
				Dog dogTemp = (Dog) animal;
				dogTemp.DogUnique();
				
			}else if(animal instanceof Cat) {
				Cat catTemp = (Cat) animal;
				catTemp.CatUnique();
			}
		}
		
	}

	public static void main(String[] args) {
		new Main();
	}

}
