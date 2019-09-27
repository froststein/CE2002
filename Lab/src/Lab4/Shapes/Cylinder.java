package Lab4.Shapes;

import java.util.Scanner;

public class Cylinder extends Shape{

	private Circle base;
	private int height;
	
	public Circle getBase() {
		return base;
	}
	
	public void setBase(Circle base) {
		this.base=base;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height=height;
	}
	
	
	@Override
	public double getArea() {
		return (base.getArea() * 2)  + (base.getRadius() * height);
	}

	@Override
	public void getDimensions() {
		Circle cir= new Circle();
		cir.getDimensions();
		this.base=cir;
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter height: ");
		this.height=sc.nextInt();
	}

}
