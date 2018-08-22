package chapter9;

/**
 * @Author
 * Karol Meksu³a
 * 06-08-2018
 * */

public class Main {

	public static void main(String[]args) {
		int[] set = new int[100];
		for(int i = 0; i < set.length; i++) {
			set[i] = i;
		}
		
		int result = BinarySearch.binarySearch(set, 92);
		System.out.println("Szukana liczba: " + result);
		
		
		System.out.println("******");
		int[] sequence = BinaryPlacing.binaryPlace(set, 98);
		//System.out.println("\nCi¹g uporz¹dkowanych liczb po binarnym umiesczaniu:\n");
		
		System.out.println("*******");
		int[] input = {2, 39, 28, 1, 34, 29, 84, 8, 9};
		int[] output = InsertionSort.linearInsertion(input);
		
		for(int i : output) {
			System.out.print(i + ", ");
		}
		
	}
	
}
