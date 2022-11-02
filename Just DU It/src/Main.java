import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	
	static String name;
	static Integer price;
	static String type;
	static Double height;
	static Integer wheels;
	static Integer index;
	static Integer delete;
	
	static Scanner sc = new Scanner(System.in);
	static Vector<String> nameList = new Vector<>();
	static Vector<Integer> priceList = new Vector<>();
	static Vector<String> typeList = new Vector<>();
	static Vector<Double> heightList = new Vector<>();
	static Vector<Integer> wheelsList = new Vector<>();
	
	public Main() {
		do {
			switch(menuList()) {
			case 1:
				userInput();
				break;
				
			case 2:
				displayList();
				break;
				
			case 3:
				displayList();
				updateData();
				break;
				
			case 4:
				displayList();
				do {
					System.out.print("Input footwear index to delete: ");
					try {
						delete = sc.nextInt();
					}catch(Exception E) {
						System.out.println("Input must be a number!");
					}finally {
						sc.nextLine();
					}
					}while(delete < 1 || delete > nameList.size());
				
				nameList.remove(delete -1);
				priceList.remove(delete -1);
				typeList.remove(delete -1);
				heightList.remove(delete -1);
				wheelsList.remove(delete -1);
				
				System.out.println("Footwear Deleted Successfully!");
				break;
				
			case 5:
				System.out.println("Thanks for using Just DU It Program !");
				System.exit(0);
				break;
			}
			
		}while(true);
		
	}

	public static void main(String[] args) {
		new Main();
	}
	
	public static int menuList() {
		Integer menu = 0;
		do {
		System.out.println("\nJust DU It !!");
		System.out.println("=============");
		System.out.println("1. Add Footwear");
		System.out.println("2. View Footwear");
		System.out.println("3. Update Footwear");
		System.out.println("4. Delete Footwear");
		System.out.println("5. Exit");
		System.out.print(">> ");
		try {
			menu = sc.nextInt();
		}catch(Exception E){
			System.out.println("Input must be a number!");
		}finally {
			sc.nextLine();
		}
		}while(menu < 1 || menu > 5);
		return menu;
	}
	
	public static void displayList() {
		if(nameList.size() < 1) {
			System.out.println("There are no footwears to display!");
		}else {
				for (int i = 0; i < priceList.size() - 1; i++) {
					for (int j = priceList.size() - 1; j > i; j--) {
						if(priceList.get(j) < priceList.get(j - 1)) {
							int temp = priceList.get(j);
							priceList.set(j, priceList.get(j - 1));
							priceList.set(j - 1, temp);
						}
					}
				}
		 System.out.println("+=====================================================================+");
         System.out.println("| No | Name                      | Price    | Height   | Total Wheels |");
         System.out.println("+=====================================================================+");
         
         for(int i = 0; i < nameList.size(); i++){
             System.out.printf("| %2d | %-25s | %-8d | %-8.2f | %-12s |\n",i+1, nameList.get(i), priceList.get(i), heightList.get(i), wheelsList.get(i));
         }
         
         System.out.println("+=====================================================================+");
		}	
		}
	
	public static void userInput() {
		do {
			System.out.print("Footwear name [3-25 characters]: ");
			name = sc.nextLine();
			}while(name.length() < 3 || name.length() > 25);
			
			do {
				System.out.print("Footwear price [more than 10000]: ");
				try {
					price = sc.nextInt();
				}catch(Exception E) {
					System.out.println("Input must be a number!");
				}finally {
					sc.nextLine();
				}
			}while(price < 10000);
			
			do {
				System.out.print("Footwear type [Heels / RollerSkate]: ");
				type = sc.nextLine();
			}while(!type.equalsIgnoreCase("Heels") && !type.equalsIgnoreCase("RollerSkate"));
			
			if(type.equals("Heels")) {
				do {
				System.out.print("Footwear height [1.0 - 9-0]: ");
				try {
					height = sc.nextDouble();
				}catch(Exception E) {
					System.out.println("Input must be a number!");
				}finally {
					sc.nextLine();
				}
				
				Footwear heel1 = new Heel(name, price, type, height);
				
				nameList.add(name);
				priceList.add(price);
				typeList.add(type);
				heightList.add(height);
				wheelsList.add(0);
				System.out.println("Footwear Added Sucessfully!");
				}while(height < 1.0 || height > 9.0);
				
			}else {
			do {
				System.out.print("Footwear total wheels [2-4 inclusive]: ");
				try {
					wheels = sc.nextInt();
				}catch(Exception E) {
					System.out.println("Input must be a number!");
				}finally {
					sc.nextLine();
				}
				Footwear rollerSkate1 = new RollerSkate(name, price, type, wheels);
				
				nameList.add(name);
				priceList.add(price);
				typeList.add(type);
				wheelsList.add(wheels);
				heightList.add((double) 0);
				System.out.println("Footwear Added Sucessfully!");
			}while(wheels < 2 || wheels > 4);
			}
	}
	
	public static void updateData() {
		do {
			System.out.print("Input footwear index to update: ");
			try {
				index = sc.nextInt();
			}catch(Exception E) {
				System.out.println("Input must be a number!");
			}finally {
				sc.nextLine();
			}
		}while(index < 1 || index > nameList.size());
		
		do {
			System.out.print("Footwear name [3-25 characters]: ");
			name = sc.nextLine();
			}while(name.length() < 3 || name.length() > 25);
			
			do {
				System.out.print("Footwear price [more than 10000]: ");
				try {
					price = sc.nextInt();
				}catch(Exception E) {
					System.out.println("Input must be a number!");
				}finally {
					sc.nextLine();
				}
			}while(price < 10000);
			
			do {
				System.out.print("Footwear type [Heels / RollerSkate]: ");
				type = sc.nextLine();
			}while(!type.equalsIgnoreCase("Heels") && !type.equalsIgnoreCase("RollerSkate"));
			
			if(type.equals("Heels")) {
				do {
				System.out.print("Footwear height [1.0 - 9-0]: ");
				try {
					height = sc.nextDouble();
				}catch(Exception E) {
					System.out.println("Input must be a number!");
				}finally {
					sc.nextLine();
				}
				}while(height < 1.0 || height > 9.0);
				
				nameList.set(index, name);
				priceList.set(index, price);
				typeList.set(index, type);
				wheelsList.set(index, wheels);
				heightList.set(index, (double) 0);
				System.out.println("Footwear Updated Sucessfully!");
				
			}else {
			do {
				System.out.print("Footwear total wheels [2-4 inclusive]: ");
				try {
					wheels = sc.nextInt();
				}catch(Exception E) {
					System.out.println("Input must be a number!");
				}finally {
					sc.nextLine();
				}
			}while(wheels < 2 || wheels > 4);
			
			nameList.set(index, name);
			priceList.set(index, price);
			typeList.set(index, type);
			heightList.set(index, height);
			wheelsList.set(index, 0);
			System.out.println("Footwear Updated Sucessfully!");
			}
	}
	
	}

