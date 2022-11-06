package main;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	static Integer menu;
	static String name;
	static String dish;
	static Integer price;
	static String type;
	static String vegetable;
	static String meat;
	static String addons;
	static Integer delete;
	static Scanner sc = new Scanner(System.in);
	Vector<Food> foodList = new Vector<>();
	
	public void addMenu() {
		do {
			System.out.print("Input menu name [8-20]: ");
			name = sc.nextLine();
		}while(name.length() < 8 || name.length() > 20);
		
		do {
			System.out.print("Input main dish [Rice | Noodle] [Case Insensitive]: ");
			dish = sc.nextLine();
		}while(!dish.equalsIgnoreCase("Rice") && !dish.equalsIgnoreCase("Noodle"));
		
		do {
			System.out.print("menu type [Vege | Non-Vege] [Case Sensitive]: ");
			type = sc.nextLine();
		}while(!type.equals("Vege") && !type.equals("Non-Vege"));
		
		if(type.equals("Vege")) {
			do {
				System.out.print("Input base price [5000 - 25000] [Multiple of 1000]: ");
				try {
					price = sc.nextInt();
				}catch(Exception E) {
					System.out.println("Input must be a number!");
				}finally {
					sc.nextLine();
				}
			}while(price < 5000 || price > 25000 || !((price % 1000) == 0));
			
			do {
				System.out.print("Input Vegetable [Potato | Tomato] [Case Insensitive]: ");
				vegetable = sc.nextLine();
			}while(!vegetable.equalsIgnoreCase("Potato") && !vegetable.equalsIgnoreCase("Tomato"));
			
			Food veg = new Vege(name, dish, type, price, vegetable);
			foodList.add(veg);
			
			System.out.println("Vege food added successfully!");
			
		}else if(type.equals("Non-Vege")) {
			do {
				System.out.print("Input base price [5000 - 25000] [Multiple of 1000]: ");
				try {
					price = sc.nextInt();
				}catch(Exception E) {
					System.out.println("Input must be a number!");
				}finally {
					sc.nextLine();
				}
			}while(price < 5000 || price > 25000 || !((price % 1000) == 0));
			
			do {
				System.out.print("Input Meat [Beef | Chicken | Pork] [Case Insensitive]: ");
				meat = sc.nextLine();
			}while(!meat.equalsIgnoreCase("Beef") && !meat.equalsIgnoreCase("Chicken") && !meat.equalsIgnoreCase("Pork"));
			
			do {
				System.out.print("Input AddOns [Meatballs | Fishballs | Fried Potato] [Case Insensitive]: ");
				addons = sc.nextLine();
			}while(!addons.equalsIgnoreCase("Meatballs") && !addons.equalsIgnoreCase("Fishballs") && !addons.equalsIgnoreCase("Fried Potato"));
			
			Food noveg = new Nonvege(name, dish, type, price, meat, addons);
			foodList.add(noveg);
			System.out.println("Non Vege food added successfully!");
		}
	}
	
	public void viewMenu() {
		if(foodList.isEmpty() == true) {
			System.out.println("No menu available!");
		}else {
				System.out.println("+=====================================================================+");
				System.out.println("| No | ID       | Name                      | Price    | Type        |");
				System.out.println("+=====================================================================+");
				
				for(int i = 0; i < foodList.size(); i++){
					System.out.printf("| %2d | %-8s | %-25s | %-8d | %-12s |\n",i+1, foodList.get(i).getID(), foodList.get(i).getName(), foodList.get(i).getPrice(), foodList.get(i).getType());
				}
				
				System.out.println("+=====================================================================+");
		}
	}
	
	public void sellMenu() {
		if(foodList.isEmpty() == true) {
			System.out.println("No menu available!");
		}else {
				System.out.println("+=====================================================================+");
				System.out.println("| No | ID       | Name                      | Price    | Type        |");
				System.out.println("+=====================================================================+");
				
				for (int i = 0; i < foodList.size(); i++) {
					System.out.printf("| %2d | %-8s | %-25s | %-8d | %-12s |\n",i+1, foodList.get(i).getID(), foodList.get(i).getID(), foodList.get(i).getName(), foodList.get(i).getPrice(), foodList.get(i).getType());
				}
				do {
					System.out.println("Input number [1 - " + foodList.size() + "]: ");
					try {
						delete = sc.nextInt();
					}catch(Exception E) {
						System.out.println("Input must be a number!");
					}finally {
						sc.nextLine();
					}
				}while(delete < 1 || delete > foodList.size());
				
				System.out.println("ID: " + foodList.get(delete).getID());
				System.out.println("Menu Name: " + foodList.get(delete).getName());
				System.out.println("Main dish: " + foodList.get(delete).getDish());
				System.out.println("Price: " + foodList.get(delete).getPrice());
				System.out.println("Grand Total: " + foodList.get(delete).calculatePrice());
				
				foodList.remove(delete - 1);
				System.out.println("Food Sold!");
		}
	}
	
	public void menuList() {
		do {
			System.out.println("\nFive Food Street");
			System.out.println("================");
			System.out.println("1. Insert New Menu");
			System.out.println("2. View All Menu");
			System.out.println("3. Sell Menu item");
			System.out.println("4. Exit");
			System.out.print(">> ");
			try {
				menu = sc.nextInt();
			}catch(Exception E) {
				System.out.println("Input must be a number!");
			}finally {
				sc.nextLine();
			}
		
		switch(menu) {
		
		case 1:
			addMenu();
			break;
			
		case 2:
			viewMenu();
			break;
			
		case 3:
			sellMenu();
			break;
			
		case 4:
			System.out.println("Thank you for visiting Five Food Street!");
			System.exit(0);
			break;
		}
		}while(true);
	}
	
	public Main() {
		menuList();
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
