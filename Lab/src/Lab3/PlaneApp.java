package Lab3;
import java.util.Scanner;
public class PlaneApp {
	public static void main(String[] args) {
		System.out.println("(1) Show number of empty seats");
		System.out.println("(2) Show the list of empty seats");
		System.out.println("(3) Show the list of seat assignments by seat ID");
		System.out.println("(4) Show the list of seat assignments by customer ID");
		System.out.println("(5) Assign a customer to a seat");
		System.out.println("(6) Remove a seat assignment ");
		System.out.println("(7) Exit ");
		Scanner sc=new Scanner(System.in);
		int choice;
		Plane p=new Plane();
		do {
			System.out.print("Enter the number of your choice: ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				p.showNumEmptySeats();	
				break;
			case 2:
				System.out.println("The follwing seats are empty: ");
				p.showEmptySeats();
				break;
			case 3:
				System.out.println("The seat assignments are as follow: ");
				p.showAssignedSeats(true);
				break;
			case 4:
				System.out.println("The seat assignments are as follow: ");
				p.showAssignedSeats(false);
				break;
			case 5:
				System.out.println("Assigning Seat...");
				System.out.print("Plese enter SeatID: ");
				int seatid=sc.nextInt();
				System.out.print("Plese enter CustomerID: ");
				int cust_id=sc.nextInt();
				p.assignSeat(seatid, cust_id);
				break;
			case 6:
				System.out.print("Enter SeatID to unassign customer from: ");
				int unseatid=sc.nextInt();
				p.unAssignSeat(unseatid);
				break;
			}
			
		}while(choice<7);
		sc.close();
	}
}
