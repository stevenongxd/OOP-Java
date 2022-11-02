package main;

public class Kucing {
	private String corakBulu;
	private String warnaMata;
	
	final static Integer kaki = 4;
	
	public Kucing(String corakBulu, String warnaMata) {
		this.corakBulu = corakBulu;
		this.corakBulu = warnaMata;
		
	}
	
	//Shortcut Generate Getter-Setter: alt +shift + s -> r
	
	public static void bersuara() {
		System.out.println("meong meong");
	}
	
	public String getCorakBulu() {
		return corakBulu;
	}

	public void setCorakBulu(String corakBulu) {
		this.corakBulu = corakBulu;
	}

	public String getWarnaMata() {
		return warnaMata;
	}

	public void setWarnaMata(String warnaMata) {
		this.warnaMata = warnaMata;
	}

	public static int getKaki() {
		return kaki;
	}
	
	public void berjalan() {
		System.out.println("Kucing Berjalan");
	}
}
