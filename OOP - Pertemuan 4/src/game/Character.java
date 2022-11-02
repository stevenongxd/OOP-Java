package game;

public abstract class Character {
	
	String name;
	
	public Character() {
		
	}
	
	public void testing() {
		System.out.println("Testing");
	}
	
	public abstract void isInvisible();
	public abstract void useSkill();

}
