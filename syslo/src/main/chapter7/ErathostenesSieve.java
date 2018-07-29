package chapter7;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 
 * Karol Meksu³a
 * 25-07-2018
 * */

public class ErathostenesSieve {
	
	public static List<Integer> sieve(int range) {
		List<Integer> rangeSet = new ArrayList<>();
		List<Integer> primes = new ArrayList<>();
	
		for(int i = 2; i < range + 1; i++) {
			rangeSet.add(i);
		}
		
		int current = 2;
		primes.add(current);
		
		while(current * current < range) {
			primes.clear();

			for(int i = 0; i < rangeSet.size(); i++) {
				int comp = rangeSet.get(i);
				
				if(comp % current != 0 || comp == current) {
					primes.add(rangeSet.get(i));
				}
				
			} current += 1; 
			
			rangeSet.clear();
			rangeSet.addAll(primes);
		}
						
		return primes;
	}
}
