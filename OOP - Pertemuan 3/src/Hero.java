
public class Hero {
	protected String name;
	protected int hp;
	protected int damage;
	
	// ctrl + shift + f
	// alt + shift + s
	public Hero(String name, int hp, int damage) {
		super();
		this.name = name;
		this.hp = hp;
		this.damage = damage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public void attack() {
		System.out.println(this.name + " is attacking an enemy with " + this.damage + " damages");
	}
	
	public void receiveDamage(int damage) {
		this.hp -= damage;
		System.out.println(this.name + " received " + damage + " damages");
	}

}
