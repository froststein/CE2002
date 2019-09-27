package Lab4.Shapes;

import java.util.Scanner;

public class Cone extends Shape {

	private Circle base;
	private int slant;
	
	public Circle getBase() {
		return base;
	}
	
	public void setBase(Circle base) {
		this.base=base;
	}
	
	public int getSlant() {
		return slant;
	}
	
	public void setSlant(int slant) {
		this.slant=slant;
	}
	
	@Override
	public double getArea() {
		return base.getArea() * Math.PI * slant;
	}

	@Override
	public void getDimensions() {
		Circle cir=new Circle();
		cir.getDimensions();
		this.base=cir;
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Slant: ");
		this.slant=sc.nextInt();
	}

}
