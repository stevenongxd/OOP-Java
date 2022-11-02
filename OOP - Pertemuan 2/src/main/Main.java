package main;

public class Main {

	public Main() {
		
		Kucing moti = new Kucing("orange dan putih", "hitam");
		Kucing timo = new Kucing("hitam dan putih", "coklat");
		
		moti.setCorakBulu("pink dan ungu");
		System.out.println("Corak bulu Moti: " + moti.getCorakBulu());
		System.out.println("Corak bulu Timo: " + timo.getCorakBulu());
		
		System.out.println("kaki timo: " + timo.kaki);
		System.out.println("kaki moti: " + moti.kaki);
	
		Kucing.bersuara();
	
	}

	public static void main(String[] args) {
		new Main();
	}

}
