package main;

public abstract class Food {
	private int price;
	private int id;
	private String chef;
	
	public Food(int price, int id, String chef) {
		super();
		this.price = price;
		this.id = id;
		this.chef = chef;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChef() {
		return chef;
	}
	public void setChef(String chef) {
		this.chef = chef;
	}
	
	public abstract void cook();
	
}
