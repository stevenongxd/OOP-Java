package main;

public class Pizza extends Food {
	
	private String dough;
	
	public Pizza(int price, int id, String chef, String dough) {
		super(price, id, chef);
		this.dough = dough;
	}
	
	public String getDough() {
		return dough;
	}

	public void setDough(String dough) {
		this.dough = dough;
	}

	@Override
	public void cook() {
		System.out.println(this.getChef() + " is baking a pizza");
	}

}
