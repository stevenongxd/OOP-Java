package main;

public class Vege extends Food{

	private String vegetable;
	
	public Vege(String name, String dish, String type, Integer price, String vegetable) {
		super(name, dish, type, price);
		this.vegetable = vegetable;
		
	}

	public String getVegetable() {
		return vegetable;
	}

	public void setVegetable(String vegetable) {
		this.vegetable = vegetable;
	}

	@Override
	public void generateID() {
		
	}

	@Override
	public Integer calculatePrice() {
		if(getDish().equals("Rice")) {
			if(getType().equals("Potato")) {
				int priceRice = 5000;
				int subTotal = (getName().length() * 2000);
				int total = 0;
				total = getPrice() + subTotal + priceRice;
			}else if(getType().equals("Tomato")) {
				int priceRice = 5000;
				int subTotal = (getName().length() * 1000);
				int total = 0;
				total = getPrice() + subTotal + priceRice;
			}
		}else if(getDish().equals("Noodle")) {
			if(getType().equals("Potato")) {
				int priceNoodle = 3000;
				int subTotal = (getName().length() * 2000);
				int total = 0;
				total = getPrice() + subTotal + priceNoodle;
			}else if(getType().equals("Tomato")) {
				int priceNoodle = 3000;
				int subTotal = (getName().length() * 1000);
				int total = 0;
				total = getPrice() + subTotal + priceNoodle;
			}
		}
		return calculatePrice();
	}

}
