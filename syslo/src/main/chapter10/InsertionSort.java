package chapter10;

/** 
 * @author 
 * Karol Meksu³a
 * 20-08-2018
 */

public class InsertionSort {

	public static int[] linearInsertion(int[] input) {
		for(int i = 1; i < input.length; i++) {
			int value = input[i];
			int previousIndex = i - 1;
		
			while(previousIndex >= 0 && input[previousIndex] > value) {
				input[previousIndex + 1] = input[previousIndex];
				--previousIndex;
			}
			
			input[previousIndex + 1] = value; 
		}
		
		return input;
	}
	
}
