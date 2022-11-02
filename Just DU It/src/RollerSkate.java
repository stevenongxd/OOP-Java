
public class RollerSkate extends Footwear{

	private Integer wheels;
	
	public RollerSkate(String name, Integer price, String type, Integer wheels) {
		super(name, price, type);
	}

	public Integer getWheels() {
		return wheels;
	}

	public void setWheels(Integer wheels) {
		this.wheels = wheels;
	}
	
}
