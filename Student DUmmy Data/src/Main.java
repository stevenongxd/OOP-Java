import java.util.Scanner;

public class Main {

	public Main() {
		Scanner sc = new Scanner(System.in);
		
		String inputName;
		Integer inputAge = 0;
		Double inputGpa = 0.0;
		
		
		System.out.println("Hello, Welcome to Student DUmmy Data!");
		
		do {
		System.out.print("Input your name [3-15 characters] (Cannot be changed): ");
		inputName = sc.nextLine();
		}while(inputName.length() < 3 || inputName.length() > 15);
		
		do {
			System.out.print("Input your age [min 16] (Cannot be changed): ");
			try {
				inputAge = sc.nextInt();
			}catch(Exception E) {
				System.out.println("Input Must Be A Number!");
			}finally {
				sc.nextLine();
			}
		}while(inputAge < 16);
		
		do {
			System.out.print("Input your gpa [0.0 - 4.0 inclusive]: ");
			try {
				inputGpa = sc.nextDouble();
			}catch(Exception E) {
				System.out.println("Input Must Be A Number!");
			}finally {
				sc.nextLine();
			}
		}while(inputGpa < 0.0 || inputGpa > 4.0);
		
		Student student1 = new Student(inputName, inputAge, inputGpa);
		System.out.println("\nStudent Data Updated Sucessfully!");	
		
		do {
		System.out.println("\nWelcome, " + student1.getName());
		switch(menuList()) {
		
		case 1:
			student1.display();
			break;
			
		case 2:
			student1.display();
			do {
				System.out.print("\nInput your NEW GPA [0.0 - 4.0 inclusive]: ");
				try {
					inputGpa = sc.nextDouble();
				}catch(Exception E) {
					System.out.println("Input Must Be A Number!");
				}finally {
					sc.nextLine();
				}
			}while(inputGpa < 0.0 || inputGpa > 4.0);
			
			System.out.println("\nStudent Data Updated Sucessfully!");
			
			student1.setGpa(inputGpa);
			break;
			
		case 3:
			System.out.println("Thank you for using Student DUmmy Data!");
			System.exit(0);
			break;
		}
		}while(true);
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
	private static int menuList() {
		Scanner sc = new Scanner(System.in);
		Integer menu = 0;
			System.out.println("\nStudent DUmmy Data");
			System.out.println("==================");
			System.out.println("1. View Data");
			System.out.println("2. Update Data");
			System.out.println("3. Exit");
			System.out.print(">> ");
			try {
				menu = sc.nextInt();
			}catch(Exception E) {
				System.out.println("[!] Input must be a number [!]");
			}finally {
				sc.nextLine();
			}
		return menu;
	}

}
