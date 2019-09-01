package Lab2;
import java.util.Scanner;
public class P1 {
	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Perform the following methods: ");
			System.out.println("1: multiplication test");
			System.out.println("2: quotient using division by subtraction");
			System.out.println("3: remainder using division by subtraction");
			System.out.println("4: count the number of digits");
			System.out.println("5: position of a digit");
			System.out.println("6: extract all odd digits");
			System.out.println("7: quit");
			choice=sc.nextInt();

			switch(choice) {
			case 1:
				mulTest();
				break;
			case 2:
				divide();
				break;
			case 3:
				modulus();
				break;
			case 4:
				countDigits();
				break;
			case 5:
				position();
				break;
			case 6:
				extractOddDigits();
				break;
			case 7:
				System.out.println("Program terminating........");
			}

		}while(choice<7);
		sc.close();
	}
	
	private static void mulTest() {
		@SuppressWarnings("resource") 
		Scanner sc=new Scanner(System.in);
		int temp1,temp2,correctCounter=0;
		for(int i=0;i<5;i++) {
			temp1=(int)(Math.random()*9)+1;
			temp2=(int)(Math.random()*9)+1;
			System.out.print(String.format("How much is %d times %d ? ",temp1,temp2));
			int ans=sc.nextInt();
			if(ans == (temp1*temp2))
				correctCounter++;
			
		}
		System.out.print(String.format("%d answers out of 5 are correct.\n", correctCounter));
		
	}
	private static void divide() {
		
	}
	private static void modulus() {
		
	}
	private static void countDigits() {
		
	}
	private static void position() {
		
	}
	private static void extractOddDigits() {
		
	}
	
}
