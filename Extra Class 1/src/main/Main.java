package main;

import java.util.Scanner;
import java.util.Vector;

public class Main {
	Scanner sc = new Scanner(System.in);
	Vector<Hero> heroes = new Vector<Hero>();
	
	public void add() {
		String name;
		String type;
		Integer age = 0;
		String gender;
		
		do {
			System.out.println("Input name (5-10 characters): ");
			name = sc.nextLine();
		}while(name.length() < 5 || name.length() > 10);
		
		do {
			System.out.println("Input age (18 or above): ");
			try {
				age = sc.nextInt();
			}catch(Exception E) {
				System.out.println("Input must be a number!\n");
			}finally {
				sc.nextLine();
			}
		}while(age < 18);
		
		do {
			System.out.println("Input gender (male/female): ");
			gender = sc.nextLine();
		}while(!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female"));
		
		do {
			System.out.println("Input type (Ranged/Melee)");
			type = sc.nextLine();
		}while(!type.equals("Ranged") && !type.equals("Melee"));
		
		if(type.equals("Melee")) {
			String sLength;
			Integer sWeight = 0;
			do {
				System.out.println("Input Sword Length (5 or above): ");
				sLength = sc.nextLine();
			}while(sLength.length() < 5);
			
			do {
				System.out.println("Input Sword Weight (3 or above): ");
				try {
					sWeight = sc.nextInt();
				}catch(Exception E) {
					System.out.println("Input must be a number!\n");
				}finally {
					sc.nextLine();
				}
			}while(sWeight < 3);
			
			Melee meleeTemp = new Melee(name, age, gender, type, sLength, sWeight);
			meleeTemp.generateID();
			
			heroes.add(meleeTemp);
		}else if(type.equals("Ranged")){
			String bQuality;
			Integer aQuantity = 0;
			do {
				System.out.println("Input Bow Quality (Bad/Good): ");
				bQuality = sc.nextLine();
			}while(!bQuality.equals("Bad") && !bQuality.equals("Good"));
			
			do {
				System.out.println("Input Arrow Quantity (10 or above): ");
				try {
					aQuantity = sc.nextInt();
				}catch(Exception E) {
					System.out.println("Input must be a number!\n");
				}finally {
					sc.nextLine();
				}
			}while(aQuantity < 10);
			
			Ranged rangedTemp = new Ranged(name, age, gender, type, bQuality, aQuantity);
			rangedTemp.generateID();
			
			heroes.add(rangedTemp);
		}
	}
	
	public void view() {
		//name & type
		for (int i = 0; i < heroes.size(); i++) {
			System.out.println(heroes.get(i).getName() + " " + heroes.get(i).getType());
		}
		
		//name only
		for (int i = 0; i < heroes.size(); i++) {
			if(heroes.get(i) instanceof Ranged) {
			System.out.println(heroes.get(i).getName() + " Ranged");
			}else if(heroes.get(i) instanceof Melee) {
				System.out.println(heroes.get(i).getName() + " Melee");
			}
		}
	}
	
	public void remove() {
		for (int i = 0; i < heroes.size(); i++) {
			System.out.println(i+1 + " " + heroes.get(i).getName() + " " + heroes.get(i).getType());
		}
		Integer opt = 0;
		do {
			System.out.println(">> ");
		try {
			opt = sc.nextInt();
		}catch(Exception E) {
			System.out.println("Input must be a number!\n");
		}finally {
			sc.nextLine();
		}
		}while(opt < 1 || opt > heroes.size());
		
		heroes.remove(opt - 1);
		
		for (int i = 0; i < heroes.size(); i++) {
			System.out.println(heroes.get(i).getName() + " " + heroes.get(i).getType());
		}
	}
	
	public void menu() {
		Integer opt = 0;
		do {
			System.out.println("1. Add Hero");
			System.out.println("2. View Hero");
			System.out.println("3. Remove Hero");
			System.out.println("4. Exit");
			System.out.print(">> ");
			try {
				opt = sc.nextInt();
			}catch(Exception E) {
				System.out.println("Input must be a number!\n");
			}finally {
				sc.nextLine();
			}
		}while(opt < 1 || opt > 4);
		
		switch(opt) {
			
		case 1:
			add();
			break;
			
		case 2:
			view();
			break;
			
		case 3:
			remove();
			break;
			
		case 4:
			System.out.println("Thank you for using this application!");
			System.exit(0);
			break;
			
		}
	}
	
	public Main() {
		menu();
	}

	public static void main(String[] args) {
		new Main();
	}

}
