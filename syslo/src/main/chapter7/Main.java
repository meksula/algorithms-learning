package chapter7;

import java.util.*;

/**
 * @Author 
 * Karol Meksu³a
 * 25-07-2018
 * */

public class Main {
	public static void main(String[] args) {
		String binary = DecimalBinary.toBinary(1993);
		System.out.println("binary: " + binary);
		
		int d = EuklidesAlgorith.euklides(9, 3);
		System.out.println("\nNajwiêkszy wspólny dzielnik: " + d);
		
		int nww = EuklidesAlgorith.nww(2, 29);
		System.out.println("\nNajmniejsza wspólna wielokrotnoœæ: " + nww);
		
		List<Integer> primes = ErathostenesSieve.sieve(1000);
		System.out.println("\nLiczby pierwsze w zakresie [100]" + primes);
		
		int[] fibonacci = Fibonacci.fibonacci(20);
		System.out.println("\nLiczby Fibonacciego: ");
		
		for(int i : fibonacci) {
			System.out.print(i + ", ");
		}
	}
}
