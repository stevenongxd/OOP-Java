
public class Support extends Hero{
	
	private int heal;
	
	public Support(String name, int hp, int damage, int heal) {
		super(name, hp, damage);
		this.heal = heal;
	}

	public int getHeal() {
		return heal;
	}

	public void setHeal(int heal) {
		this.heal = heal;
	}
	
	public void heal(Hero h) {
		h.setHp(h.getHp() + this.heal);
		System.out.println(this.name + " healed " + h.getName() + " for " + this.heal + " health");
	}

}
