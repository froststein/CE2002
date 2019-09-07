package Lab4.Shapes;
import java.util.Scanner;

public class Circle extends Shape{
	private double radius;
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double rad) {
		this.radius=rad;
	}
	
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public void getDimensions() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius: ");
		this.radius=sc.nextDouble();
	}

}
