import java.util.Scanner;
public class P2 {
	public static void main(String[] args) {
		double salary;
		int point;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Salary: ");
		salary=sc.nextDouble();
		System.out.print("Enter Merit Point: ");
		point=sc.nextInt();

		System.out.println("Salary: "+String.format("$%10.2f", salary)+" Merit: "+point);

		if(salary>=500 && salary<=649) {
			if(point>=10 && salary>=600) {
				System.out.println("Grade B");
			}else {
				System.out.println("Grade C");
			}
		}else if(salary >=600 && salary <=799) {
			if(point>=20 && salary>=700) {
				System.out.println("Grade A");
			}else {
				System.out.println("Grade B");
			}
		}else if(salary>=700 && salary<=899) {
			System.out.println("Grade A");
		}else {
			System.out.println("Grade not defined.");
		}

		sc.close();

	}
}


