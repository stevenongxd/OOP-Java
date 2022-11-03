package main;

import java.util.Random;

public class Melee extends Hero{

	private String swordLength;
	private Integer swordWeight;
	
	public Melee(String name, Integer age, String gender, String type, String swordLength, Integer swordWeight) {
		super(name, age, gender, type);
		this.swordLength = swordLength;
		this.swordWeight = swordWeight;
	}

	public String getSwordLength() {
		return swordLength;
	}

	public void setSwordLength(String swordLength) {
		this.swordLength = swordLength;
	}

	public Integer getSwordWeight() {
		return swordWeight;
	}

	public void setSwordWeight(Integer swordWeight) {
		this.swordWeight = swordWeight;
	}

	@Override
	public void generateID() {
		Random rand = new Random();
		String ID = "ML" + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10);
		super.setID(ID);
	}
	
}
