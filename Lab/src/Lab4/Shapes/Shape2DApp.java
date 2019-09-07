package Lab4.Shapes;

import java.util.Scanner;

public class Shape2DApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter total number of shapes: ");
		int size=sc.nextInt();
		Shape[] sList=new Shape[size];
		
		for(int i=0 ; i < size;i++) {
			System.out.println(String.format("Enter shape no %d : ", i+1));
			System.out.println("=============");
			System.out.println("1. Circle");
			System.out.println("2. Triangle");
			System.out.println("3. Square");
			System.out.println("4. Rectangle");
			System.out.println("Enter shape option(1-4): ");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				Circle c=new Circle();
				c.getDimensions();
				sList[i]=c;
				break;
			case 2:
				Triangle t=new Triangle();
				t.getDimensions();
				sList[i]=t;
				break;
			case 3:
				Rectangle s=new Rectangle();
				s.getDimensions();
				sList[i]=s;
				break;
			case 4:
				Rectangle r=new Rectangle();
				r.getDimensions();
				sList[i]=r;
				break;			
			}
			
		}
		
		double totalArea=0;
		for(Shape s : sList) {
			totalArea+=s.getArea();
		}
		System.out.println("");
		System.out.printf("\nTotal Area: %.2f",totalArea);
		
		sc.close();
	}
}
