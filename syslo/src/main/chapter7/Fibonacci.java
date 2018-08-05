package chapter7;

/**
 * @Author 
 * Karol Meksu³a
 * 04-08-2018
 * */

public class Fibonacci {

	public static int[] fibonacci(int elements) {
		int[] fibonacci = new int[elements];
		fibonacci[0] = 1;
		fibonacci[1] = 1;
		
		for(int i = 2; i < elements; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		
		return fibonacci;
	}
	
}
