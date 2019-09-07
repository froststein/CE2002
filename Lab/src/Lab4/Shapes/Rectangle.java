package Lab4.Shapes;
import java.util.Scanner;

public class Rectangle extends Shape{

	private double length;
	private double breath;

	public double getLength() {
		return length;
	}

	public void setLength(double l) {
		this.length=l;
	}

	public double getBreath() {
		return breath;
	}

	public void setBreath(double b) {
		this.breath=b;
	}

	@Override
	public double getArea() {
		return this.length * this.breath;
	}

	@Override
	public void getDimensions() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter length: ");
		this.length=sc.nextDouble();
		System.out.print("Enter breath: ");
		this.breath=sc.nextDouble();
	}

}
