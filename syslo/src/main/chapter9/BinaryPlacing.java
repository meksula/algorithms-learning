package chapter9;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author
 * Karol Meksu³a
 * 12-08-2018
 * */

public class BinaryPlacing {
	private static int[] resultSequence;
	private static int counter = 0;
	
	public static int[] binaryPlace(int[] set, int element) {
		if(counter == 0) {
			resultSequence = set;
		}
		
		int middleIndex = set.length / 2;
		int first = set[0];
		int last = set[set.length - 1];
		
		if(element < first) {
			System.out.println("Przed tym elementem nale¿y w³o¿yæ nowy element: " + first);
			return resultSequence;
		}
		
		if(element > last) {
			System.out.println("Po tym elemencie nale¿y w³o¿yæ nowy element: " + last);
		}
		
		if(element == set[middleIndex] || set.length == 1) {
			System.out.println("Nalezy umieœciæ element po, lub przed elementem " + set[middleIndex]);
			return resultSequence;
		}
		
		if(element < set[middleIndex]) {
			int[] subset = new int[middleIndex];
			for(int i = 0; i < middleIndex; i++) {
				subset[i] = set[i + 1];
			}
			
			BinaryPlacing.binaryPlace(subset, element);
		}
		
		if(element > set[middleIndex]) {
			List<Integer> subset = new ArrayList<>();
			
			for(int i = middleIndex; i < set.length; i++) {
				subset.add(set[i]);
			}
			
			int[] subarray = new int[subset.size()];
			
			for(int i = 0; i < subarray.length; i++) {
				subarray[i] = subset.get(i);
			}
			
			BinaryPlacing.binaryPlace(subarray, element);
		}
		
		return resultSequence;
	}
	
	
	
}
