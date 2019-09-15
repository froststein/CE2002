/*
 * Question 4 of Tutorial 4
 */
public class UnknownOperatorException extends Exception {
	private static final long serialVersionUID = -7867985417873965620L;

	public UnknownOperatorException() {

	}
	public UnknownOperatorException(char op) {

	}
	public UnknownOperatorException(String msg) {
		super(msg);
	}
}
