package chapter9;

import java.util.Arrays;

/**
 * @Author
 * Karol Meksu³a
 * 06-08-2018
 * */

public class BinarySearch {
	
	public static int binarySearch(int[] set, int search) {
		int middleIndex = set.length / 2;
		int[] part = null;
		
		if(search == set[middleIndex]) {
			return set[middleIndex];
		}
		
		else if(search < set[middleIndex]) {
			part = new int[middleIndex];
			for(int i = 0; i < middleIndex; i++) {
				part[i] = set[i];
			}

		}
		
		else if(search > set[middleIndex]) {
			part = new int[middleIndex];
			
			int c = 0;
			for(int i = middleIndex + 1; i < set.length; i++) {
				part[c] = set[i];
				c++;
			}
		}
		
		return BinarySearch.binarySearch(part, search);
	}
	
}
