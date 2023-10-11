package main;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	static String name;
	static Integer age;
	static String role;
	static Integer gpa;
	static Integer salary;
	static Integer delete;
	Scanner sc = new Scanner(System.in);
	Vector<People> peopleList = new Vector<People>();
	
	public void menu() {
		Integer menu = 0;
		
		do {
		System.out.println("\n1. Add People");
		System.out.println("2. View People");
		System.out.println("3. Remove People");
		System.out.println("4. Exit");
		System.out.print(">> ");
		try {
			menu = sc.nextInt();
		}catch(Exception E){
			System.out.println("Input must be a number!");
		}finally {
			sc.nextLine();
		}
		
		switch(menu) {
		
		case 1:
			addPeople();
			break;
			
		case 2:
			viewPeople();
			break;
			
		case 3:
			deletePeople();
			break;
			
		case 4:
			System.out.println("Thank you for using DeU's Class!");
			System.exit(0);
			break;
		}
		}while(true);
	}
	
	public void addPeople() {
		do {
		System.out.print("\nInput name [3-15 characters]: ");
		name = sc.nextLine();
		}while(name.length() < 3 || name.length() > 15);
		
		do {
			System.out.print("Input age [min 16]: ");
			try {
				age = sc.nextInt();
			}catch(Exception E){
				System.out.println("Input must be a number!");
			}finally {
				sc.nextLine();
			}
		}while(age < 16);
		
		do {
			System.out.print("Input role [Student / Lecturer]: ");
			role = sc.nextLine();
		}while(!role.equals("Student") && !role.equals("Lecturer"));
		
		if(role.equals("Student")) {
			do {
			System.out.print("Input GPA [0-4]: ");
			try {
				gpa = sc.nextInt();
			}catch(Exception E){
				System.out.println("Input must be a number!");
			}finally {
				sc.nextLine();
			}
			}while(gpa < 0 || gpa > 4);
			
			People std = new Student(name, age, role, gpa);
			peopleList.add(std);
			
			System.out.println("Student Added Successfully!");
			
		}else if(role.equals("Lecturer")) {
			do {
				System.out.print("Input salary [min 4000000]: ");
				try {
					salary = sc.nextInt();
				}catch(Exception E){
					System.out.println("Input must be a number!");
				}finally {
					sc.nextLine();
				}
			}while(salary < 4000000);
			
			People lec = new Lecturer(name, age, role, salary);
			peopleList.add(lec);
			
			System.out.println("Lecturer Added Successfully!");
		}
	}
	
	public void viewPeople() {
		if(peopleList.isEmpty() == true) {
			System.out.println("There are no peoples in classroom!");
		}else {
			for (People people : peopleList) {
				System.out.println("\nHello, my name is " + people.getName());
				System.out.println("I am " + people.getAge() + " year(s) old");
				System.out.println("I am a " + people.getRole());
				if(people instanceof Lecturer) {
					System.out.println("My salary is " + ((Lecturer) people).getSalary()); 
			}else if(people instanceof Student) {
				System.out.println("My GPA is " + ((Student) people).getGpa()); 
			}
		}
		}
	}
	
	public void deletePeople() {
		viewPeople();
		do {
			System.out.print("\nInput index to delete: ");
			try {
				delete = sc.nextInt();
			}catch(Exception E) {
				System.out.println("Input must be a number!");
			}finally {
				sc.nextLine();
			}
			}while(delete < 1 || delete > peopleList.size());
		
		peopleList.remove(delete - 1);
		
		System.out.println("The selected person has been deleted!");
	}
	
	public Main() {
		menu();
	}

	public static void main(String[] args) {
		new Main();
	}

}
