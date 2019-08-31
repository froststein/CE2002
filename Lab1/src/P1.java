import java.util.Scanner;
public class P1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char choice;
		System.out.println("Enter A,B,C or D");
		choice=sc.nextLine().charAt(0);
		switch(Character.toUpperCase(choice)) {
		case 'A':
			System.out.println("Action movie fan.");
			break;
		case 'B':
			System.out.println("Invalid choice.");
			break;
		case 'C':
			System.out.println("Comedy movie fan.");
			break;
		case 'D':
			System.out.println("Drama movie fan.");
			break;
		default:
			System.out.println("Invalid!");
			break;
		}

		sc.close();
	}
}
