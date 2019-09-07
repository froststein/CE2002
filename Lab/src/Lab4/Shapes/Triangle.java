package Lab4.Shapes;
import java.util.Scanner;

public class Triangle extends Shape {

	private double height;
	private double base;
	
	
	@Override
	public double getArea() {
		return (1/2) * this.height * this.base;
	}

	@Override
	public void getDimensions() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter height: ");
		this.height=sc.nextDouble();
		System.out.print("Enter base: ");
		this.base=sc.nextDouble();
	}

}
