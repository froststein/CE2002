package Lab4;

import java.util.Scanner;

public class Strings {
	// --------------------------------------------
	// Reads in an array of strings, sorts them,
	// then prints them in sorted order.
	// --------------------------------------------
	public static void main (String[] args)
	{
		String [] stringList;
		int size;
		Scanner scan = new Scanner(System.in);
		System.out.print ("\nHow many strings do you want to sort? ");
		size = scan.nextInt();
		stringList = new String[size];
		System.out.println ("\nEnter the string...");
		for (int i = 0; i < size; i++) {
			stringList[i] = scan.next();
		}
		Sorting.selectionSort(stringList);
		System.out.println ("\nYour strings in sorted order(Selection Sort, Ascending) ...");
		for (int i = 0; i < size; i++)
			System.out.print(stringList[i] + " ");
		System.out.println();
		Sorting.insertionSortReverse(stringList);
		System.out.println("\nYour strings in sorted order(Insertion Sort, Descending)");
		for (int i = 0; i < size; i++)
			System.out.print(stringList[i] + " ");
		System.out.println();
		scan.close();
	}
}
