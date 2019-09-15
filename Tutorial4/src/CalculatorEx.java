import java.util.Scanner;

public class CalculatorEx {
	public CalculatorEx(){
		System.out.println("Calculator is on");
		doCalculation();
	}

	public double resultValue() {
		return 0;
	}

	public void doCalculation() {
		double result=0.0;
		double n2=0.0;
		char op = ' ';
		Scanner sc = new Scanner(System.in);
		do {
			System.out.printf("result = %.2f \n",result);
			op=sc.next().charAt(0);
			n2=sc.nextDouble();

			result=evaluate(op,result,n2);
			System.out.printf("updated result = %.2f \n",result);

		}while(op != 'Q' || op != 'q');
		
	}

	public double evaluate(char op, double n1, double n2) {
		switch(op) {
		case '+':
			n1+=n2;
			return n1;
		case '-':
			n1-=n2;
			return n1;
		case '*':
			n1*=n2;
			return n1;
		case '/':
			n1/=n2;
			return n1;
		default:
			return 0;
		}
	}

	public double handleUnknownOpException() {
		return 0;
	}

	public static void main(String[] args) {
		CalculatorEx cal=new CalculatorEx();
	}
}
