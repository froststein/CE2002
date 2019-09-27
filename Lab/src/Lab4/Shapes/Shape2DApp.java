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
				Circle cir=new Circle();
				cir.getDimensions();
				sList[i]=cir;
				break;
			case 2:
				Triangle tri=new Triangle();
				tri.getDimensions();
				sList[i]=tri;
				break;
			case 3:
				Rectangle sq=new Rectangle();
				sq.getDimensions();
				sList[i]=sq;
				break;
			case 4:
				Rectangle rec=new Rectangle();
				rec.getDimensions();
				sList[i]=rec;
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
