import java.util.Scanner;

public class VendingMachineApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of drinks: ");
		int numDrink = sc.nextInt();
		Drink[] drinks = new Drink[numDrink]; 
		for (int i =0; i<numDrink; i++ ){
			System.out.println("Please enter Drink Name: ");
			String drinkName = sc.next();
			System.out.println("Please enter Drink Price: ");
			double drinkPrice = sc.nextDouble();
			drinks[i] = new Drink(drinkName,drinkPrice) ;
		}
		VendingMachine vm = new VendingMachine(drinks) ;
		vm.start();

		sc.close();
	}
}
