import java.util.Scanner;
public class P3 {
	private static final double RATE=1.82;

	private static void forloop(int start,int end,int incre) {
		System.out.println("For Loop");
		System.out.println("US$         S$");
		System.out.println("----------------");
		for(; start<=end;start+=incre) {
			System.out.println(start+"     "+String.format("%10.2f", start*RATE));
		}
		System.out.println("");
	}
	private static void whileLoop(int start,int end,int incre) {
		System.out.println("While Loop");
		System.out.println("US$         S$");
		System.out.println("----------------");
		while(start<=end) {
			System.out.println(start+"     "+String.format("%10.2f", start*RATE));
			start+=incre;
		}
		System.out.println();
	}
	private static void dowhileLoop(int start,int end,int incre) {
		System.out.println("Do while Loop");
		System.out.println("US$         S$");
		System.out.println("----------------");
		do{
			System.out.println(start+"     "+String.format("%10.2f", start*RATE));
			start+=incre;
		}while(start<=end);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start,end,incre;
		System.out.print("Starting: ");
		start=sc.nextInt();
		System.out.print("Ending: ");
		end=sc.nextInt();
		System.out.print("Increment: ");
		incre=sc.nextInt();
		System.out.println("====================================");
		System.out.println("Starting: "+start+" Ending: "+end+" Increment: "+incre);
		System.out.println("====================================");
		if((start > end) || (incre > end))
			System.out.print("Error!");
		else {
			forloop(start,end,incre);
			whileLoop(start,end,incre);
			dowhileLoop(start,end,incre);
		}
		sc.close();
	}
}
