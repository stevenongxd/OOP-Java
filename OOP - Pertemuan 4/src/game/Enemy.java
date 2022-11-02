package game;

public class Enemy extends Character implements Fireball, WinterStorm{

	public Enemy() {
	
	}

	@Override
	public void useSkill() {
		System.out.println("Enemy Blink");
	}

	@Override
	public void isInvisible() {
		System.out.println("Enemy is invisible");
	}

	@Override
	public void fireballRaid() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fireballAttack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void winterAttack() {
		// TODO Auto-generated method stub
		
	}
	

}
