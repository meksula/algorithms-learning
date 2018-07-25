package chapter6;

import java.util.List;

/**
 * @Author
 * Karol Meksuła
 * 19-07-2018
 *
 * Algorytm `Sortowania bąbelkowego` polega na tym, że porównujemy ze sobą kolejne dwie wartości w zbiorze.
 * Większą wartość ustawiamy wyżej, a mniejszą niżej. Wynosimy największe wartości do góry, aż zbiór zostanie
 * całkowicie uporządkowany.
 *
 * */

public class BubbleSort {

    public List<Integer> bubbleSort(List<Integer> collection) {
        int setEndIndex = collection.size() - 1;

        while (setEndIndex > 0) {
            for (int i = 0; i < collection.size() -1 ; i++) {
                if (collection.get(i) > collection.get(i + 1)) {
                    Integer tmp = collection.get(i);
                    collection.set(i, collection.get(i + 1));
                    collection.set(i + 1, tmp);
                }
            }
            setEndIndex--;
        }

        return collection;
    }

}
