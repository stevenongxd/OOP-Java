package main;

public class Nonvege extends Food{

	private String meat;
	private String addons;
	
	public Nonvege(String name, String dish, String type, Integer price, String meat, String addons) {
		super(name, dish, type, price);
		this.meat = meat;
		this.addons = addons;
	}
	
	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public String getAddons() {
		return addons;
	}

	public void setAddons(String addons) {
		this.addons = addons;
	}

	@Override
	public void generateID() {
		
	}

	@Override
	public Integer calculatePrice() {
		
		if (getDish().equalsIgnoreCase("Rice")) {
			
			if (getMeat().equalsIgnoreCase("beef")) {
				
				int total;
				if (getAddons().equalsIgnoreCase("meatballs")) {
					total = 5000 + getName().length() * 2500 + 4000 + getPrice(); 
					
				}else if (getMeat().equalsIgnoreCase("chicken")) {
					total = 5000 + getName().length() * 2500 + 3000 + getPrice();  
					
				}else if (getAddons().equalsIgnoreCase("Fried potato")) {
					total = 5000 + getName().length() * 2500 + 5000 + getPrice();
					
				}else if (getMeat().equalsIgnoreCase("Chicken")) {
					
					if (getAddons().equalsIgnoreCase("meatballs")) {
						total = 5000 + getName().length() * 1000 + 4000 + getPrice(); 
						
					}else if (getMeat().equalsIgnoreCase("chicken")) {
						total = 5000 + getName().length() * 1000 + 3000 + getPrice();  
						
					}else if (getMeat().equalsIgnoreCase("Fried potato")) {
						total = 5000 + getName().length() * 1000 + 5000 + getPrice();
					}
					
				}else if (getMeat().equalsIgnoreCase("Pork")) {
					
					if (getAddons().equalsIgnoreCase("meatballs")) {
						total = 5000 + getName().length() * 2000 + 4000 + getPrice(); 
						
					}else if (getMeat().equalsIgnoreCase("chicken")) {
						total = 5000 + getName().length() * 2000 + 3000 + getPrice();  
						
					}else if (getAddons().equalsIgnoreCase("Fried potato")) {
						total = 5000 + getName().length() * 2000 + 5000 + getPrice();
					}
				}
			}
		}else if(getDish().equalsIgnoreCase("Noodle")) {
if (getMeat().equalsIgnoreCase("beef")) {
				
				int total;
				if (getAddons().equalsIgnoreCase("meatballs")) {
					total = 3000 + getName().length() * 2500 + 4000 + getPrice(); 
					
				}else if (getMeat().equalsIgnoreCase("chicken")) {
					total = 3000 + getName().length() * 2500 + 3000 + getPrice();  
					
				}else if (getAddons().equalsIgnoreCase("Fried potato")) {
					total = 3000 + getName().length() * 2500 + 5000 + getPrice();
					
				}else if (getMeat().equalsIgnoreCase("Chicken")) {
					
					if (getAddons().equalsIgnoreCase("meatballs")) {
						total = 3000 + getName().length() * 1000 + 4000 + getPrice(); 
						
					}else if (getMeat().equalsIgnoreCase("chicken")) {
						total = 3000 + getName().length() * 1000 + 3000 + getPrice();  
						
					}else if (getMeat().equalsIgnoreCase("Fried potato")) {
						total = 3000 + getName().length() * 1000 + 5000 + getPrice();
					}
					
				}else if (getMeat().equalsIgnoreCase("Pork")) {
					
					if (getAddons().equalsIgnoreCase("meatballs")) {
						total = 3000 + getName().length() * 2000 + 4000 + getPrice(); 
						
					}else if (getMeat().equalsIgnoreCase("chicken")) {
						total = 3000 + getName().length() * 2000 + 3000 + getPrice();  
						
					}else if (getAddons().equalsIgnoreCase("Fried potato")) {
						total = 3000 + getName().length() * 2000 + 5000 + getPrice();
					}
				}
			}
		}
		
		return calculatePrice();
	}	
	}


