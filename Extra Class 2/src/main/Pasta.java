package main;

public class Pasta extends Food {

	private String noodle;
	
	public Pasta(int price, int id, String chef, String noddle) {
		super(price, id, chef);
		this.noodle = noodle;
	}
	
	public String getNoodle() {
		return noodle;
	}

	public void setNoodle(String noodle) {
		this.noodle = noodle;
	}

	@Override
	public void cook() {
		System.out.println(this.getChef() + " is cooking a pasta");
	}

}
