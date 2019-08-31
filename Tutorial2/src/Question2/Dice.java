package Question2;

public class Dice {
	private int valueOfDice;
	public Dice() {
		setDiceValue();
	}
	public void setDiceValue() {
		this.valueOfDice=(int)(Math.random()*6)+1;
	}
	public int getDiceValue() {
		return valueOfDice;
	}
	public void printDiceValue() {
		System.out.println("Current value is : "+getDiceValue());
	}
}
