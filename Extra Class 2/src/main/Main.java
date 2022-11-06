package main;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	Scanner sc = new Scanner(System.in);
	Vector<Food> vFood = new Vector<Food>();
	int id = 1;
	Random rand = new Random();
	String pizzaID = "P";
	
	String genID() {
		pizzaID += rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10);
		return pizzaID;
	}
	
	void addPasta() {
		int price = 0;
		String chef = "";
		String noodle = "";
		
		do {
			System.out.print("Input chef name [5-15 characters]: ");
			chef = sc.nextLine();
		}while(chef.length() <= 5 || chef.length() >= 15);
		
		do {
			System.out.print("Input price [$5 - $15]: ");
			try {
				price = sc.nextInt();
			}catch(Exception E) {
				System.out.println("Input must be a number!");
			}finally {
				sc.nextLine();
			}
		}while(price < 5 || price > 15);
		
		do {
			System.out.print("Input pasta noodle [spaghetti / fetuccini / penne]: ");
			noodle = sc.nextLine();
		}while(!noodle.equals("spaghetti") && !noodle.equals("fetuccini") && !noodle.equals("penne"));
		
		vFood.add(new Pizza(price, id, chef, noodle));
		id++;
		
		System.out.println("Successfully added a new food!");
	}
	
	void addPizza() {
		int price = 0;
		String chef = "";
		String dough = "";
		
		do {
			System.out.print("Input chef name [5-15 characters]: ");
			chef = sc.nextLine();
		}while(chef.length() <= 5 || chef.length() >= 15);
		
		do {
			System.out.print("Input price [$5 - $15]: ");
			try {
				price = sc.nextInt();
			}catch(Exception E) {
				System.out.println("Input must be a number!");
			}finally {
				sc.nextLine();
			}
		}while(price < 5 || price > 15);
		
		do {
			System.out.print("Input dough name [must contains dough]: ");
			dough = sc.nextLine();
		}while(!dough.endsWith("dough"));
		
		vFood.add(new Pizza(price, id, chef, dough));
		id++;
		
		System.out.println("Successfully added a new food!");
	}
	
	public void addFood() {
		int foodOpt = 0;
		
		do {
		System.out.println("1. Pizza");
		System.out.println("2. Pasta");
		System.out.print(">> ");
		try {
			foodOpt = sc.nextInt();
		}catch(Exception E) {
			System.out.println("Input must be a number!");
		}finally {
			sc.nextLine();
		}
		
		switch (foodOpt) {
		
		case 1:
			addPizza();
			break;
			
		case 2:
			addPasta();
			break;
			
		}	
		}while(foodOpt != 2);
	}
	
	void viewFood() {
		if(vFood.isEmpty() == true) {
			System.out.println("No food available!");
		}else {
		for (Food food : vFood) {
			if(food instanceof Pizza) {
				System.out.println(food.getId() + " " + food.getChef() + " " + food.getPrice() + " " + ((Pizza)food).getDough());
			}else if(food instanceof Pasta) {
				System.out.println(food.getId() + " " + food.getChef() + " " + food.getPrice() + " " + ((Pasta)food).getNoodle());
			}
		}
		}
	}
	
	void updateFood() {
		int update = 0;
		Food f = null;
		boolean found = false;
		String noodle = "";
		String dough = "";
		int idx = 0;
		int price = 0;
		String chef = "";
		if(vFood.isEmpty() == true) {
			System.out.println("No food available!");
		}else {
		for (Food food : vFood) {
			if(food instanceof Pizza) {
				System.out.println(food.getId() + " " + food.getChef() + " " + food.getPrice() + " " + ((Pizza)food).getDough());
			}else if(food instanceof Pasta) {
				System.out.println(food.getId() + " " + food.getChef() + " " + food.getPrice() + " " + ((Pasta)food).getNoodle());
			}
		}
		}
		System.out.println("Input food ID to be deleted: ");
		try {
			update = sc.nextInt();
		}catch(Exception E) {
			System.out.println("Input must be a number!");
		}finally {
			sc.nextLine();
		}
		for (Food food : vFood) {
			if(update == food.getId()) {
				f = food;
				found = true;
				id = food.getId();
				idx = food.getId() - 1;
				if(((Pizza)food).getDough().length() != 0) {
					dough = ((Pizza)food).getDough();
				}else if(((Pasta)food).getNoodle().length() != 0) {
					noodle = ((Pasta)food).getNoodle();
				}
			}
			if(found) {
				do {
					System.out.print("Input chef name [5-15 characters]: ");
					chef = sc.nextLine();
				}while(chef.length() <= 5 || chef.length() >= 15);
				
				do {
					System.out.print("Input price [$5 - $15]: ");
					try {
						price = sc.nextInt();
					}catch(Exception E) {
						System.out.println("Input must be a number!");
					}finally {
						sc.nextLine();
					}
				}while(price < 5 || price > 15);
				
				if(noodle.length() != 0) {
					do {
						System.out.print("Input pasta noodle [spaghetti / fetuccini / penne]: ");
						noodle = sc.nextLine();
					}while(!noodle.equals("spaghetti") && !noodle.equals("fetuccini") && !noodle.equals("penne"));
					vFood.set(idx, new Pasta(price, id, chef, noodle));
				}else if(dough.length() != 0) {
					do {
						System.out.print("Input dough name [must contains dough]: ");
						dough = sc.nextLine();
					}while(!dough.endsWith("dough"));
					vFood.set(idx, new Pizza(price, id, chef, dough));
				}
				System.out.println("Successfully updated food!");
			}else {
				System.out.println("No food available!");
			}
		}
	}
	
	void deleteFood() {
		int delete = 0;
		Food f = null;
		boolean found = false;
		if(vFood.isEmpty() == true) {
			System.out.println("No food available!");
		}else {
		for (Food food : vFood) {
			if(food instanceof Pizza) {
				System.out.println(food.getId() + " " + food.getChef() + " " + food.getPrice() + " " + ((Pizza)food).getDough());
			}else if(food instanceof Pasta) {
				System.out.println(food.getId() + " " + food.getChef() + " " + food.getPrice() + " " + ((Pasta)food).getNoodle());
			}
		}
		}
		System.out.println("Input food ID to be deleted: ");
		try {
			delete = sc.nextInt();
		}catch(Exception E) {
			System.out.println("Input must be a number!");
		}finally {
			sc.nextLine();
		}
		for (Food food : vFood) {
			if(delete == food.getId()) {
				f = food;
				found = true;
			}
		}
		if(found) {
			vFood.remove(f);
			System.out.println("Successfully removed food!");
		}else {
			System.out.println("No food available!");
		}
	}
	
	public Main() {
		int menu = 0;
		
		do {
			System.out.println("1. Add food");
			System.out.println("2. View food");
			System.out.println("3. Update food");
			System.out.println("4. Delete food");
			System.out.println("5. Exit");
			System.out.print(">> ");
			try {
				menu = sc.nextInt();
			}catch(Exception E) {
				System.out.println("Input must be a number!");
			}finally {
				sc.nextLine();
			}
			switch (menu) {
			
			case 1:
				addFood();
				break;
				
			case 2:
				viewFood();
				break;
				
			case 3:
				updateFood();
				break;
	
			case 4:
				deleteFood();
				break;
	
			case 5:
				System.out.println("Thank you for using this application!");
				System.exit(0);
				break;
			
			}
			
		}while(menu != 5);
		
	}

	public static void main(String[] args) {
		new Main();
	}

}
