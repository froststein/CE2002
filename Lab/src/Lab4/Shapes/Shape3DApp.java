package Lab4.Shapes;

import java.util.Scanner;

public class Shape3DApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter total number of shapes: ");
		int size=sc.nextInt();
		Shape[] sList=new Shape[size];
		
		for(int i=0 ; i < size;i++) {
			System.out.println(String.format("Enter shape no %d : ", i+1));
			System.out.println("=============");
			System.out.println("1. Sphere");
			System.out.println("2. Pyramid");
			System.out.println("3. Cuboid");
			System.out.println("4. Cone");
			System.out.println("5. Cylinder");
			System.out.println("Enter shape option(1-5): ");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				Sphere sph=new Sphere();
				sph.getDimensions();
				sList[i]=sph;
				break;
			case 2:
				Pyramid pry=new Pyramid();
				pry.getDimensions();
				sList[i]=pry;
				break;
			case 3:
				Cuboid cub=new Cuboid();
				cub.getDimensions();
				sList[i]=cub;
				break;	
			case 4:
				Cone con=new Cone();
				con.getDimensions();
				sList[i]=con;
				break;	
			case 5:
				Cylinder cyl=new Cylinder();
				cyl.getDimensions();
				sList[i]=cyl;
				break;	
			}
			
		}
		
		double totalArea=0;
		for(Shape s : sList) {
			totalArea+=s.getArea();
		}
		System.out.println("");
		System.out.printf("\nTotal Surface Area: %.2f",totalArea);
		
		sc.close();
	}
}
