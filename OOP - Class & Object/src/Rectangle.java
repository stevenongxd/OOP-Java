
public class Rectangle {
	double width;
	double height;
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2 * width * height;
	}
	
	public Rectangle(double new_width, double new_height) {
		this.width = new_width;
		this.height = new_height;
	}
}
