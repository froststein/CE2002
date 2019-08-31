package Question2;
import java.util.Scanner;
public class DiceApp {
	public static void main(String[] args) {
		int total=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please <Key> to roll the first dice");
		sc.nextLine();
		Dice d1=new Dice();
		d1.printDiceValue();
		total+=d1.getDiceValue();

		System.out.println("Please <Key> to roll the second dice");
		sc.nextLine();
		Dice d2=new Dice();
		d2.printDiceValue();
		total+=d2.getDiceValue();

		System.out.println("Your total number is: "+total);
		sc.close();
	}
}
