import java.util.Scanner;
import java.util.Vector;

public class Main {

	public Main() {
		Hero lucio = new Hero("Lucio", 300, 30);
		lucio.attack();
		System.out.println(lucio.getHp());
		lucio.receiveDamage(40);
		System.out.println(lucio.getHp());
		
		System.out.println();
		
		Tank roadHog = new Tank("Road Hog", 700, 60, 20);
		roadHog.attack();
		roadHog.receiveDamage(50);
		System.out.println(roadHog.getHp());
		
		System.out.println();
		
		Support mercy = new Support("Mercy", 250, 10, 40);
		System.out.println(lucio.getHp());
		mercy.heal(lucio);
		System.out.println(lucio.getHp());
		
		System.out.println();
		
		System.out.println(roadHog.getHp());
		mercy.heal(roadHog);
		System.out.println(roadHog.getHp());
		
		System.out.println();
		
		System.out.println(roadHog.getHp());
		roadHog.receiveDamage(mercy.getDamage());
		System.out.println(roadHog.getHp());
		
		System.out.println("\n");
		
		Scanner sc = new Scanner(System.in);
		Vector<Hero> listHeroes = new Vector<>();
		
		int menu;
		String name;
		int health = 0;
		int damage = 0;
		int damageBlock = 0;
		int heal = 0;
		
		System.out.println("Which hero do you want to create?");
		System.out.println("1. Tank");
		System.out.println("2. Support");
		System.out.print(">> ");
		menu = sc.nextInt();
		sc.nextLine();
		
		if(menu == 1) {
			do {
			System.out.print("Insert Tank Name\t\t: ");
			name = sc.nextLine();
			}while(name.length() < 3);
			
			do {
			System.out.print("Insert Tank Health\t\t: ");
			try {
				health = sc.nextInt();
			}catch(Exception E) {
				System.out.println("Input Must Be A Number!");
			}finally {
				sc.nextLine();
			}
			}while(health < 1);
			
			do {
			System.out.print("Insert Tank Damage\t\t: ");
			try {
			damage = sc.nextInt();
			}catch(Exception E) {
				System.out.println("Input Must Be A Number!");
			}finally {
				sc.nextLine();
			}
			}while(damage < 1);
			
			do {
			System.out.print("Insert Tank Damage Block\t: ");
			try {
			damageBlock = sc.nextInt();
			}catch (Exception E) {
				System.out.println("Input Must Be A Number");
			}finally {
				sc.nextLine();
			}
			}while(damageBlock < 1);
			
			Tank tank = new Tank(name, health, damage, damageBlock);
			
			
			System.out.println("\nSuccessfully Created A New Hero!");
			System.out.println("Name\t\t\t: " + name);
			System.out.println("Health\t\t\t: " + health);
			System.out.println("Damage\t\t\t: " + damage);
			System.out.println("Damage Reduction\t: " + damageBlock);
			
		}else if(menu == 2) {
			do {
				System.out.print("Insert Tank Name\t\t: ");
				name = sc.nextLine();
				}while(name.length() < 3);
				
				do {
				System.out.print("Insert Tank Health\t\t: ");
				try {
					health = sc.nextInt();
				}catch(Exception E) {
					System.out.println("Input Must Be A Number!");
				}finally {
					sc.nextLine();
				}
				}while(health < 1);
				
				do {
				System.out.print("Insert Tank Damage\t\t: ");
				try {
				damage = sc.nextInt();
				}catch(Exception E) {
					System.out.println("Input Must Be A Number!");
				}finally {
					sc.nextLine();
				}
				}while(damage < 1);
			
				do {
				System.out.print("Insert Support Heal\t: ");
				try {
				heal = sc.nextInt();
				}catch(Exception E) {
					System.out.println("Input Must Be A Number!");
				}finally {
					sc.nextLine();
				}
				}while(heal < 1);
			
			Support support = new Support(name, health, damage, heal);
			
			System.out.println("\nSuccessfully Created A New Hero!");
			System.out.println("Name\t: " + name);
			System.out.println("Health\t: " + health);
			System.out.println("Damage\t: " + damage);
			System.out.println("Heal\t: " + heal);
		}
	}

	public static void main(String[] args) {
		new Main();
	}

}
