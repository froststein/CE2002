/*
 * Question 2 of Tutorial 4
 */
public class PowerFailureException extends Exception{
	private static final long serialVersionUID = 7920897589346196570L;

	public PowerFailureException() {
		super("Power Failure!");
	}
	public PowerFailureException(String errorMessage) {
		super(errorMessage);
	}
}
