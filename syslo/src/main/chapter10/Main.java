package main.chapter10;

import java.util.Arrays;

/**
 * @author
 * Karol Meksu?a
 * 27-08-2018
 * */

public class Main {

	public static void main(String[] args) {
		int[] setX = {3,7,11,19,23,72,92};
		int[] setY = {1,9,24,63,82,91,95};
		
		int[] result = MergeSort.merge2(setX, setY);
		
		System.out.println("Wynik scalania dw?ch ci?g?w uporz?dkowanych:\n");
		
		for(int i : result) {
			System.out.print(i + ", ");
		}

		System.out.println("\n\n********************");
		System.out.println("QUICK SORT ALGORITHM\n");

		int[] set = {44, 35, 22, 19, 8, 94, 38, 46, 53, 101, 34, 13, 5};
		System.out.println("BEFORE: " + Arrays.toString(set));

		int[] sortedSet = new QuickSort(set).quickSort();

		System.out.println("AFTER: " + Arrays.toString(sortedSet));

		System.out.println("\n\n*** ***\nQuick Sort wersja nr. 2");

		int[] beforeSort = ArrayOperations.shuffleIntsArrays(set);
		int[] resultSorted = new QuickSortImproved().quickSort(beforeSort);
		System.out.println(Arrays.toString(beforeSort));
		System.out.println(Arrays.toString(resultSorted));
	}
	
}
