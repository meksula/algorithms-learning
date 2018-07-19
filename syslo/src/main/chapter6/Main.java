package main.chapter6;

import java.util.Arrays;
import java.util.List;

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

    }
}
