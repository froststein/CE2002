import java.util.Scanner;
public class P4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int height;
		System.out.print("Enter height: ");
		height=sc.nextInt();
		for(int	i=1;i<=height;i++) {
			for(int j=0;j<i;j++) {
				if(i%2!=0) {
					if(j%2==0) {
						System.out.print("AA");
					}else {
						System.out.print("BB");
					}
				}
				else {
					if(j%2==0) {
						System.out.print("BB");
					}else {
						System.out.print("AA");
					}
				}

			}
			System.out.println("");
		}


		sc.close();
	}
}
