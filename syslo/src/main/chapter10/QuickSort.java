package main.chapter10;

import java.util.Random;

/**
 * @author
 * Karol Meksuła
 * 16-09-2018
 * */

public class QuickSort {
    private int[] set;

    public QuickSort(int[] set) {
        this.set = set;
    }

    /**
     * Metoda publiczna, rozpocznająca pracę algorytmu rekurencyjnego.
     * Wywołana metoda sort() z pierwszym elementem tablicy oraz z ostatnim elementem.
     * */
    public int[] quickSort() {
        if (set == null) {
            throw new IllegalStateException("Nie zainicjalizowano tablicy!");
        }

        sort(0, set.length - 1);
        return set;
    }

    /**
     * Jeśli pierwszy index jest mniejszy od ostatniego + 1, to */
    private void sort(int first, int last) {
        if (last <= first) {
            return;
        }

        int index = divide(first, last);
        sort(first, index - 1);
        sort(index + 1, last);
    }

    /**
     * Na początku zamieniamy miejscami element o indexie 'first' z losowym elementem z przedziału.
     * Granicę ustawiamy na first + 1
     * Iterujemy w pętli od granicy do ostatniego indeksu włącznie:
     *      Jeżeli element i jest mniejszy od elementu first to zamieniamy miejscami element i z elementem border + 1
     * Po wyjściu z pętli zamieniamy first z border - 1
     * */
    private int divide(int first, int last) {
        swap(first, getPivot(first, last));
        int border = first + 1;

        for (int i = border; i <= last; i++) {
            if (set[i] < set[first]) {
                swap(i, border++);
            }
        }

        swap(first, border - 1);
        return border - 1;
    }

    /**
     * Losowo wyznaczamy środek zbioru spośród jego jeszcze nieposortowanych elementów.
     * */
    private int getPivot(int low, int high) {
        Random rand = new Random();
        return rand.nextInt((high - low) + 1) + low;
    }

    /**
     * Zamienieniamy miejscami elementy o dwóch indeksach
     * */
    private void swap(int indexA, int indexB) {
        int tmp = set[indexA];
        set[indexA] = set[indexB];
        set[indexB] = tmp;
    }

}
