package main;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	Scanner sc = new Scanner(System.in);
	Vector<Creation> cr = new Vector<>();
	Integer menu;
	String name;
	String type;
	String title;
	String genreP;
	String genreM;
	String instrument;
	String guestName;
	Integer durationP;
	Integer durationM;
	Integer view;
	Integer index;
	
	public void newCreation() {
		do {
			System.out.println("Input Creator Name [5-20 characters]: ");
			name  = sc.nextLine();
		}while(name.length() < 5 || name.length() > 20);
		
		do{
			System.out.println("Creation Type [Podcast | Music] (Case Sensitive): ");
			type = sc.nextLine();
		}while(!type.equals("Podcast") && !type.equals("Music"));
		
		if(type.equals("Podcast")) {
			do {
				System.out.println("Input Title [5-30 characters]: ");
				title = sc.nextLine();
			}while(title.length() < 5 || title.length() > 30);
			
			do {
				System.out.println("Input Genre [Comedy | Horror | Sport] (Case Sensitive): ");
				genreP = sc.nextLine();
			}while(!genreP.equals("Comedy") && !genreP.equals("Horror") && !genreP.equals("Sport"));
			
			do {
				System.out.println("Input Guest Name - must start with [Mr. | Ms. ] (Case Sensitive): ");
				guestName = sc.nextLine();
			}while(!guestName.equals("Mr. ") && !guestName.equals("Ms. "));
			
			do {
				System.out.println("Input Duration [1-60]: ");
				try {
					durationP = sc.nextInt();
				}catch(Exception E) {
					System.out.println("Input must be a number!");
				}finally {
					sc.nextLine();
				}
			}while(durationP <= 1 || durationP >= 60);
			
			view = 0;
			Podcast pod = new Podcast(name, type, title, durationP, genreP, guestName, view);
			cr.add(pod);
			System.out.println("A new creation has been added");
			sc.nextLine();
			
		}else if(type.equals("Music")) {
			do {
				System.out.println("Input Title [5-30 characters]: ");
				title = sc.nextLine();
			}while(title.length() < 5 || title.length() > 30);
			
			do {
				System.out.println("Input Genre [Pop | Jazz |Rock] (Case Senstive): ");
				genreM = sc.nextLine();
			}while(!genreM.equals("Pop") && !genreM.equals("Jazz") && !genreM.equals("Rock"));
			
			do {
				System.out.println("Input Music Instrument [Electric Guitar | Piano | Rhythm Guitars] (Case Sensitive): ");
				instrument = sc.nextLine();
			}while(!instrument.equals("Electric Guitar") && !instrument.equals("Piano") && !instrument.equals("Rhythm Guitars"));
			
			do {
				System.out.println("Input Duration [1-60]: ");
				try {
					durationM = sc.nextInt();
				}catch(Exception E) {
					System.out.println("Input must be a number!");
				}finally {
					sc.nextLine();
				}
			}while(durationM <= 1 || durationM >= 60);	
			
			view = 0;
			Music msc = new Music(name, type, title, durationM, genreM, instrument, view);
			cr.add(msc);
			System.out.println("A new creation has been added");
			sc.nextLine();
		}
	}
	
	public void viewCreation() {
		if(cr.isEmpty() == true) {
			System.out.println("You have no creation!");
			System.out.println("Press enter to continue...");
			sc.nextLine();
		}else {
			for (int i = 0; i < cr.size(); i++) {
				for (Creation creation2 : cr) {
					System.out.println("Creation Data");
					System.out.println("=============");
					System.out.println("Creator Name: " + cr.get(i).getCreatorName());
					System.out.println("Title: " + cr.get(i).getTitle());
					System.out.println("Creation Type: " + cr.get(i).getCreatorType());
					if(creation2 instanceof Music) {
						System.out.println("Genre: " + cr.get(i)(Music)((Music) creation2).getGenreM());
						System.out.println("Guest Name: - ");
						System.out.println("Music Instrument: " + cr.get(i)());
						System.out.println("Duration: " + cr.get(i)(Music)creation2).getDurationM());
						System.out.println("Views: " + view);
					}else if(creation2 instanceof Podcast) {
						System.out.println("Genre: " +  cr.get(i)(Podcast)((Podcast) creation2).getGenreP());
						System.out.println("Guest Name: " + cr.get(i)(Podcast)((Podcast) creation2).getGuestName());
						System.out.println("Music Instrument: - ");
						System.out.println("Duration: " + cr.get(i)(Podcast)((Podcast) creation2).getDurationP());
						System.out.println("Views: " + view);
					}
				}
			}
		}
	}
	
	public void publishCreation() {
		if(cr.isEmpty() == true) {
			System.out.println("You have no creation!");
			System.out.println("Press enter to continue...");
			sc.nextLine();
		}else {
			viewCreation();
			do {
				System.out.println("Input index creation to be published: ");
				try {
					index = sc.nextInt();
				}catch(Exception E) {
					System.out.println("Input must be a number!");
				}finally {
					sc.nextLine();
				}
			}while(index < 1 || index > cr.size());
			
			System.out.println("All your creation have been published");
			System.out.println("Press enter to continue...");
			sc.nextLine();
			
		}
		
	}
	
	public void menu() {
		do {
			System.out.println("SpoFiTy");
			System.out.println("=======");
			System.out.println("1. Add new creation");
			System.out.println("2. View all creation");
			System.out.println("3. Publish all creation");
			System.out.println("4. Exit");
			try {
				menu = sc.nextInt();
			}catch(Exception E) {
				System.out.println("Input must be a number!");
			}finally {
				sc.nextLine();
			}
			
		switch(menu) {
		case 1:
			newCreation();
			break;
			
		case 2:
			viewCreation();
			break;
			
		case 3:
			publishCreation();
			break;
			
		case 4:
			System.out.println("Hope you have a good day, thank you!");
			System.exit(0);
			break;
		}
		}while(true);
	}
	
	public Main() {
		menu();
	}

	public static void main(String[] args) {
		new Main();
	}

}
