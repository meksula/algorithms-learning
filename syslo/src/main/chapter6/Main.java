package chapter6;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * @Author 
 * Karol Meksu³a
 * 25-07-2018
 * */

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        List<Integer> sorted = bubbleSort.bubbleSort(Arrays.asList(23, 13, 393, 14, 1, -4, 24));
        System.out.println(sorted);

        SelectionSort selectionSort = new SelectionSort();
        int[] sorted2 = selectionSort.selectionSort(new int[]{23, 13, 393, -9, 12, 26});

        for (int i : sorted2) {
            System.out.print(i + ", ");
        }

        System.out.println("\n\nCzas na sortowanie kube³kowe [Bucket sort]\n");
        
        //////// bucket sort
        String[] bucketSort = {"karol", "s³uchawki", "butelka", "herbata", "ksi¹¿ka", "zeszyt"};
        bucketSort = BucketSort.bucketSort(bucketSort);
        
        for(int i = 0; i < bucketSort.length; i++) {
        	System.out.print(bucketSort[i] + ", ");
        }
        
        
        /////// a teraz sortowanie pozycyjne [Radix sort]
        System.out.println("\n\nA teraz sortowanie pozycyjne [radix sort]\n");
        
        
        ////// bêdziemy sortowaæ obiekty reprezentuj¹ce daty
        ////// pomijam interfejs Comparable<T> w celu przeæwiczenia algorytmu
        LocalDate[] dates = {
        		LocalDate.of(1993, 8, 11), 
        		LocalDate.of(2001, 9, 11), 
        		LocalDate.of(1410, 7, 12),
        		LocalDate.of(1939, 9, 1),
        		LocalDate.of(996, 7, 4),
        		LocalDate.of(1971, 6, 4),
        		LocalDate.of(2001, 9, 18)
        };
        
        LocalDate[] result = RadixSort.radixDateSort(dates);  
        
        for(LocalDate date : result) {
        	System.out.println(date.toString());
        }
    }
}
