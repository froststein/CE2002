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
				divideTest();
				break;
			case 3:
				modulusTest();
				break;
			case 4:
				countDigitsTest();
				break;
			case 5:
				positionTest();
				break;
			case 6:
				extractOddDigitsTest();
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

	private static int divide(int m,int n) {
		int counter=0;
		while(m>=n) {
			m-=n;
			++counter;
		}
		return counter;
	}

	private static void divideTest() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value for m:");
		int m=sc.nextInt();
		System.out.print("Enter valye for n:");
		int n=sc.nextInt();
		System.out.println(String.format("%d / %d = %d", m,n,divide(m,n)));
	}

	private static int modulus(int m,int n) {
		for(; m >= 0; m -= n) {}
		return m+n;
	}
	public static void modulusTest() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value for m:");
		int m=sc.nextInt();
		System.out.print("Enter valye for n:");
		int n=sc.nextInt();
		System.out.println(String.format("%d %% %d =%d",m,n,modulus(m,n)));
	}

	private static int countDigits(int n) {
		return (int) (Math.log10(n) + 1);
	}

	private static void countDigitsTest() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value for n:");
		int n=sc.nextInt();
		if(n<0)
			System.out.println("Error input!!");
		else
			System.out.println("Count = "+countDigits(n));
	}

	private static int position(int n,int digit) {
		String nString=Integer.toString(n);
		for (int i = nString.length()-1; i <nString.length(); i--) {
			if (nString.charAt(i) == Integer.toString(digit).charAt(0)) {
				return i+1;
			}
		}
		return -1;
	}

	private static void positionTest() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value for n:");
		int n=sc.nextInt();
		System.out.print("Enter digit in n:");
		int digit=sc.nextInt();
		System.out.println("Position = "+position(n,digit));
	}

	private static long extractOddDigits(long e) {
		int result = 0;
		int currentPos = 0;
		while(e > 0) {
			if ( (e % 10) % 2 == 1) {
				result += (e % 10) * Math.pow(10, currentPos);
				currentPos++;
			}
			e = e / 10;
		}
		return (result == 0)? -1 : result;
	}
	private static void extractOddDigitsTest() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value for n:");
		long e=sc.nextInt();
		if(e<0)
			System.out.println("oddDigits = Error input!!");
		else
			System.out.println("oddDigits = "+extractOddDigits(e));
	}
}
