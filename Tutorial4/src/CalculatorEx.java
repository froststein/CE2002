import java.util.Scanner;

public class CalculatorEx {
	public CalculatorEx(){
		System.out.println("Calculator is on");
		doCalculation();
		System.out.println("End of Program");
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
			if(op == 'Q' || op == 'q') 
				break;
			n2=sc.nextDouble();
			
			try {
				result=evaluate(op,result,n2);
			} catch (UnknownOperatorException e) {
				result=handleUnknownOpException();
			}
			System.out.printf("updated result = %.2f \n",result);

		}while(true);
		sc.close();
		System.out.println("Final result= "+result);
	}

	public double evaluate(char op, double n1, double n2) throws UnknownOperatorException{
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
			throw new UnknownOperatorException(op);
		}

	}

	public double handleUnknownOpException() {
		return 0;
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		CalculatorEx cal=new CalculatorEx();
	}
}
