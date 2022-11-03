package main;

import java.util.Random;

public class Ranged extends Hero{

	private String bowQuality;
	private Integer arrowQuantity;
	
	public Ranged(String name, Integer age, String gender, String type, String bowQuality, Integer bowQuantity) {
		super(name, age, gender, type);
		this.bowQuality = bowQuality;
		this.arrowQuantity = bowQuantity;
	}

	public String getBowQuality() {
		return bowQuality;
	}

	public void setBowQuality(String bowQuality) {
		this.bowQuality = bowQuality;
	}

	public Integer getBowQuantity() {
		return arrowQuantity;
	}

	public void setBowQuantity(Integer bowQuantity) {
		this.arrowQuantity = bowQuantity;
	}

	@Override
	public void generateID() {
		Random rand = new Random();
		String ID = "RG" + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10);
		super.setID(ID);
	}
	
	

}
