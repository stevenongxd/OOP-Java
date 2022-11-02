
public class Tank extends Hero{
	
	private int damageBlock;
	
	public Tank(String name, int hp, int damage, int damageBlock) {
		super(name, hp, damage);
		this.damageBlock = damageBlock;
	}

	public int getDamageBlock() {
		return damageBlock;
	}

	public void setDamageBlock(int damageBlock) {
		this.damageBlock = damageBlock;
	}
	
	public void receiveDamage(int damage) {
		int receivedDamage = damage - this.damageBlock;
		if(receivedDamage < 0) {
			receivedDamage = 0;
		}
		
		this.hp -= receivedDamage;
		System.out.println(this.name + " received " + receivedDamage + " damages");
	}

}
