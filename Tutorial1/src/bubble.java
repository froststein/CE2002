import java.util.Arrays;
import java.util.Scanner;

public class bubble {

	private static void bubblesort(int a[]) {
		int lastIndex=a.length-1;
		for(int i=1;i<a.length;i++) {
			boolean sorted = true;
			int currentIndex = -1;
			for(int j=0; j<lastIndex;j++) {
				if(a[j] >a[j+1]) {
					int temp = a[i];
					a[j]=a[j+1];
					a[j+1]=temp;
					sorted=false;
					currentIndex=j;
				}
			}
			if(sorted) return;
			lastIndex=currentIndex;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter number of Integer elements to be sorted: ");
		size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter integer value for element no."+(i+1));
			a[i]=sc.nextInt();
		}

		System.out.println("Unsorted array: "+Arrays.toString(a));
		// Parse array through bubble sort
		bubblesort(a);
		// Print sorted array
		System.out.println("Sorted array: "+Arrays.toString(a));


		sc.close();

	}
}
