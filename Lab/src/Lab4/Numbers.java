package Lab4;

import java.util.Scanner;
public class Numbers 
{
	// --------------------------------------------
	// Reads in an array of integers, sorts them,
	// then prints them in sorted order.
	// --------------------------------------------
	public static void main (String[] args)
	{
		/**
		 * Change the int[] to Integer[]
		 * This is because int[] is an array that is primitive to int
		 * int does not implement to any interface
		 * therefore int cannot be used with the class Comparable.
		 */
		Integer [] intList;
		int size;
		Scanner scan = new Scanner(System.in);
		System.out.print ("\nHow many integers do you want to sort? ");
		size = scan.nextInt();
		intList = new Integer[size];
		System.out.println ("\nEnter the numbers...");
		for (int i = 0; i < size; i++)
			intList[i] = scan.nextInt();
		Sorting.selectionSort(intList);
		System.out.println ("\nYour numbers in sorted order(Selection Sort, Ascending)...");
		for (int i = 0; i < size; i++)
			System.out.print(intList[i] + " ");
		System.out.println ();
		Sorting.insertionSortReverse(intList);
		System.out.println("\nYour numbers in sorted order(Insertion Sort, Descending)");
		for (int i = 0; i < size; i++)
			System.out.print(intList[i] + " ");
		System.out.println();
		scan.close();
	}
}
