import java.util.Scanner;

public class Main {
	public Main() {
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		int menu = 0;
		int inputPanjang = 0;
		int inputLebar = 0;
		int inputTinggi = 0;
		
		do {
		System.out.print("Welcome, please input your name [5-25 chars]: ");
		name = sc.nextLine();
		}while(name.length() < 5 || name.length() > 25);
		
		do {
		do {
		System.out.println("\nWelcome, " + name);
		System.out.println("Shape Printer");
		System.out.println("=============");
		System.out.println("1. Full Rectangle Shape");
		System.out.println("2. Empty Rectangle Shape");
		System.out.println("3. Right Triangle Shape");
		System.out.println("4. Exit");
		System.out.print("Choose >> ");
		try {
			menu = sc.nextInt();
		}catch(Exception E) {
			System.out.println("[!] Input must be a number [!]");
		}finally {
			sc.nextLine();
		}
		}while(menu < 1 || menu > 4);
		
		switch(menu) {
		
		case 1:
			do {
			System.out.print("Input Panjang [Greater than 1]: ");
			try {
				inputPanjang = sc.nextInt();
			}catch(Exception E) {
				System.out.print("[!] Input must be a number [!]");
			}finally {
				sc.nextLine();
			}
			System.out.print("Input Lebar [Greater than 1]: ");
			try {
				inputLebar = sc.nextInt();
			}catch(Exception E) {
				System.out.println("[!] Input must be a number [!]");
			}finally {
				sc.nextLine();
			}
			}while(inputPanjang <= 1 && inputLebar <= 1);

			hasilFullRec(inputPanjang, inputLebar);
			
			break;
		
		case 2:
			do {
			System.out.print("Input Panjang [Greater than 2]: ");
			try {
				inputPanjang = sc.nextInt();
			}catch(Exception E) {
				System.out.print("[!] Input must be a number [!]");
			}finally {
				sc.nextLine();
			}
			System.out.print("Input Lebar [Greater than 2]: ");
			try {
				inputLebar = sc.nextInt();
			}catch(Exception E) {
				System.out.println("[!] Input must be a number [!]");
			}finally {
				sc.nextLine();				}
			}while(inputPanjang <= 2 && inputLebar <= 2);
			
			hasilEmptyRec(inputPanjang, inputLebar);
			
			break;
		
		case 3:
			do {
				System.out.print("Input Panjang [Greater than 3]: ");
				try {
					inputPanjang = sc.nextInt();
				}catch(Exception E) {
					System.out.print("[!] Input must be a number [!]");
				}finally {
					sc.nextLine();
				}
				System.out.print("Input Tinggi [Greater than 3]: ");
				try {
					inputTinggi = sc.nextInt();
				}catch(Exception E) {
					System.out.print("[!] Input must be a number [!]");
				}finally {
					sc.nextLine();
						}
				}while(inputPanjang <= 3 && inputTinggi <= 3);
			
			hasilRightTri(inputPanjang, inputTinggi);
			
			break;
			
		case 4:
			System.out.println("Thank You For Using Shape Printer!");
			System.exit(0);
			break;
		}
		
		}while(menu != 4);
	}
	
	private static void hasilFullRec(int lebar, int panjang) {
		for (int i = 0; i <= lebar; i++){
            for (int j = 0; j <= panjang; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
	}
	private static void hasilEmptyRec(int lebar, int panjang) {
		for (int i = 0; i <= lebar; i++){
            for (int j = 0; j <= panjang; j++){
            	if (i == 1 || i == lebar || j == 1 || j == panjang)           
                        System.out.print("*");           
                    else
                        System.out.print(" ");           
                }
                System.out.println();
		}

	}
	private static void hasilRightTri(int panjang, int tinggi) {
		for (int i = 0; i < panjang; i++) {
			for (int j = 0; j < tinggi; j++) {
				System.out.print("*");
				if(i == j) {
				break;
				}
				
			}
			System.out.println("");
			
		}
	}
	
}
