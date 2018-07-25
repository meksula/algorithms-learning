package chapter6;

import java.util.*;

/**
 * @Author
 * Karol Meksu³a
 * 22-07-2018
 * */

public class BucketSort {
	static final int CHAR_CONSTANT = 97;
	
	public static String[] bucketSort(String[] set) {

		@SuppressWarnings("unchecked")
		Bucket<String>[] buckets = new Bucket[26];
 		
		for(int i = 0; i < buckets.length; i++) {
			buckets[i] = new Bucket<String>((char) (i + CHAR_CONSTANT));
		}
		
		for(int i = 0; i < set.length; i++) {
			char first = set[i].charAt(0);
			buckets[first - CHAR_CONSTANT].toss(set[i]);
		}
		
		List<String> ordered = new ArrayList<>();

		for(Bucket b : buckets) {
			ordered.addAll(b.getBucket());
		}
		
		return ordered.toArray(new String[ordered.size()]);
	}
	
}
