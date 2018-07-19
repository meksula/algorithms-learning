package main.chapter6;

/**
 * @Author
 * Karol Meksuła
 * 19-07-2018
 *
 * Algorytm `porządkowania przez wybór` polega na tym, że szukamy najmniejszej wartości w zbiorze,
 * a następnie ustawiamy ją na pierwszym indeksie w danym zbiorze.
 * Taką procedurę powtarzamy, aż cały zbiór zostanie uporządkowany.
 *
 * */

public class SelectionSort {

    public int[] selectionSort(int[] set) {
        int beginOfUnsortedSet = 0;

        while (beginOfUnsortedSet < set.length) {
            int minIndex = min(set, beginOfUnsortedSet);

            int temp = set[minIndex];
            set[minIndex] = set[beginOfUnsortedSet];
            set[beginOfUnsortedSet] = temp;

            beginOfUnsortedSet++;
        }

        return set;
    }

    private int min(int[] set, int begin) {
        int minIndex = begin;

        for (int i = begin; i < set.length; i++) {
            if (set[i] < set[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

}
