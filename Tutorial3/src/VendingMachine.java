import java.util.Scanner;

public class VendingMachine {

	public Drink[] drinks;

	public VendingMachine(Drink[] drinks) {
		this.drinks=drinks;
	}

	public void start() {
		do {
			double drinkCost = selectDrink();
			double amt = insertCoins(drinkCost);
			checkChange(amt,drinkCost);
			printReceipt();
		}while(true);
	}

	public double selectDrink() {
		int selection=0;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("====== Vending Machine ======");
		for(int i=0;i<drinks.length;i++) {
			System.out.println("|"+(i+1) + " Buy " + drinks[i].getDrinkName() +
					String.format("($%.2f)    |", drinks[i].getDrinkPrice()) + " |");
		}
		System.out.println("==============================");
		do {
			System.out.println("Please enter selection");
			selection=sc.nextInt();
		}while(selection < 1 || selection > drinks.length);

		return drinks[selection-1].getDrinkPrice();
	}

	public double insertCoins(double drinkCost) {
		double amt=0;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Please insert coins: ");
		System.out.println("========== Coins Input ===========");
		System.out.println("|Enter 'Q' for ten cents input   |");
		System.out.println("|Enter 'T' for twenty cents input|");
		System.out.println("|Enter 'F' for fifty cents input |");
		System.out.println("|Enter 'N' for a dollar input    |");
		System.out.println("==================================");
		do {
			char coin=sc.next().charAt(0);
			switch(coin) {
			case 'Q': case 'q':
				amt+=0.1;
				break;
			case 'T': case 't':
				amt+=0.2;
				break;
			case 'F': case 'f':
				amt+=0.5;
				break;
			case 'N': case 'n':
				amt+=1;
				break;
			}
			System.out.printf("Coins inserted: $%.2f \n",amt);
		}while(amt < drinkCost);
		
		return amt;
	}

	public void checkChange(double amount, double drinkCost) {
		double change=amount-drinkCost;
		System.out.printf("Change: $%.2f \n",change);
	}

	public void printReceipt() {
		System.out.println("Please collect your drink");
		System.out.println("Thank You !!");
	}
}
