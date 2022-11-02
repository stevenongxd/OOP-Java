
public class Circle {
	
	//atribute
	double radius;
	
	//method
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public double getPerimeter() {
		return 2 * 3.14 * radius;
	}
	
	//constructor
	public Circle(int new_radius) {
		this.radius = new_radius;
	}
	
	public Circle() {
		
	}

	public static void main(String[] args) {
		
	}

}
