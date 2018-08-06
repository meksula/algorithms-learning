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
	}
	
}
