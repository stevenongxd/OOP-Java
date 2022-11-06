package main;

public abstract class Food {
	
	private String name;
	private String dish;
	private String type;
	private Integer price;
	private String ID;
	
	public Food(String name, String dish, String type, Integer price) {
		super();
		this.name = name;
		this.dish = dish;
		this.type = type;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDish() {
		return dish;
	}

	public void setDish(String dish) {
		this.dish = dish;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public abstract void generateID();
	
	public abstract Integer calculatePrice();
	
}
