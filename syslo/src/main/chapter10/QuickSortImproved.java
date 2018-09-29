package main.chapter10;

/**
 * @author
 * Karol Meksuła
 * 29-09-2018
 * */

public class QuickSortImproved {
    private int[] set;

    public int[] quickSort(int[] set) {
        this.set = set;
        sort(this.set, 0, set.length - 1);
        return this.set;
    }

    private void sort(int[] set, int first, int last) {
        if (last <= first) {
            return;
        }
        int var = partition(first, last);
        sort(set, first, var - 1);
        sort(set, var + 1, last);
    }

    private int partition(int first, int last) {
        int i = first;
        int j = last + 1;
        int pivot = set[i];

        while (true) {
            while (less(set[i++], pivot)) {
                if (i == last) {
                    break;
                }
            }
            while (less(pivot, set[--j])) {
                if (j == first) {
                    break;
                }
            }

            if (i >= j) {
                break;
            }
            swap(i, j);
        }
        swap(first, j);
        return j;
    }

    private boolean less(int pivot, int i) {
        return pivot < i;
    }

    private void swap(int a, int b) {
        int tmp = set[a];
        set[a] = set[b];
        set[b] = tmp;
    }

}
