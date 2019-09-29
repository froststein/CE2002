/*
 * Question 4 of Tutorial 4
 */
public class UnknownOperatorException extends Exception {
	private static final long serialVersionUID = -7867985417873965620L;

	public UnknownOperatorException() {

	}
	public UnknownOperatorException(char op) {
		System.out.print(op + " is an unknown operator\n");
	}
	public UnknownOperatorException(String msg) {
		super(msg);
	}
}
