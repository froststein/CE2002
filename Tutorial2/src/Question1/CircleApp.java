package Question1;
import java.util.Scanner;
/*
 * Additional checks were added to catch errors from the program
 * This tutorial does not require error catching
 */


public class CircleApp {
	public static void main(String[] args) {
		System.out.println("==== Circle Computation =====");
		System.out.println("|1. Create a new circle     |");
		System.out.println("|2. Print Area              |");
		System.out.println("|3. Print circumference     |");
		System.out.println("|4. Quit                    |");
		System.out.println("=============================");
		int opt=-1;			
		boolean objcreated=false;
		boolean resetcircle=false;
		Circle c=null;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("Choose option(1-3): ");	
			if(sc.hasNextInt()) {
				opt=sc.nextInt();
				switch(opt) {
				case 1:
					while(objcreated==false || resetcircle==true) {
						System.out.println("Enter the radius to compute the area and circumference: ");
						if(sc.hasNextInt()) {
							int rad=sc.nextInt();
							c=new Circle(rad);
							objcreated=true;
							resetcircle=true;
							System.out.println("A new circle is created.");
							break;
						}else {
							sc.next();
							System.out.println("Invalid Input");
						}
					}							
					break;
				case 2:
					if(objcreated)
						c.printArea();
					else
						System.out.println("Circle object not created.");
					break;
				case 3:
					if(objcreated)
						c.printCircumference();
					else
						System.out.println("Circle object not created.");
					break;
				case 4:
					System.out.println("Thank you!");
					break;
				default:
					System.out.println("Invalid option");
					break;
				}
			}
			else {
				sc.next();
				System.out.println("Invalid option");
			}

		}while(opt!=4);
		sc.close();
	}
}
