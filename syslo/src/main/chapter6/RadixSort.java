package chapter6;

import java.util.*;
import java.util.stream.Collectors;
import java.time.*;

/**@Author 
 * Karol Meksu³a
 * 25-07-2018
 * */

public class RadixSort {
	
	public static LocalDate[] radixDateSort(LocalDate[] dateSet) {
		List<LocalDate> result = new ArrayList<>();

		List<Bucket<LocalDate>> daysBuckets = new ArrayList<>();
		for(int i = 1; i <= 31; i++) {
			Bucket<LocalDate> bucket = new Bucket<>(i);
			daysBuckets.add(bucket);
			for(LocalDate ld : dateSet) {
				if(ld.getDayOfMonth() == i) {
					bucket.toss(ld);
				}
			}
		}
		
		result = RadixSort.updateList(daysBuckets);
		
		List<Bucket<LocalDate>> monthsBuckets = new ArrayList<>();
		for(int i = 1; i <= 12; i++) {
			Bucket<LocalDate> bucket = new Bucket<>(i);
			monthsBuckets.add(bucket);
			for(LocalDate date : result) {
				if(date.getMonthValue() == i) {
					bucket.toss(date);
				}
			}
		}
		
		result = RadixSort.updateList(monthsBuckets);
		
		List<Bucket<LocalDate>> yearBuckets = new ArrayList<>();
		for(int i = 0; i <= 21; i++) {
			Bucket<LocalDate> ageBucket = new Bucket<>(i);
			yearBuckets.add(ageBucket);
			for(LocalDate date : dateSet) {
				if(date.getYear() / 100 == i) {
					ageBucket.toss(date);
				}
			}
		}
	
		result = RadixSort.updateList(yearBuckets);
		return result.toArray(new LocalDate[dateSet.length]);
	}
	
	private static List<LocalDate> updateList(List<Bucket<LocalDate>> buckets) {
		List<List<LocalDate>> dates = buckets
				.stream()
				.map(bucket -> bucket.bucketPieces)
				.collect(Collectors.toList());
		
		List<LocalDate> result = new ArrayList<>();
		dates.forEach(list -> result.addAll(list));
		
		return result;
	}
	
}
