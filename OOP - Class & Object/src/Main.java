
public class Main {

	public static void main(String[] args) {
		Circle circle1 = new Circle(7);
		double luas = circle1.getArea();
		double perimeter = circle1.getPerimeter();
		System.out.println("Luas: " + luas);
		System.out.println("Keliling: " + circle1.getPerimeter());
		
		Rectangle rect1 = new Rectangle(10, 5);
		System.out.println("\nLuas Rectangle: " + rect1.getArea());
		System.out.println("Keliling Rectangle: " + rect1.getPerimeter());
	}

}
