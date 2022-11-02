package game;

public class Player extends Character{

	public Player() {
		
	}

	@Override
	public void useSkill() {
		System.out.println("Player Heal");
	}

	@Override
	public void isInvisible() {
		// Player tidak bisa invis = kosongin (cara yang jelek) - pake interface
	}

}
