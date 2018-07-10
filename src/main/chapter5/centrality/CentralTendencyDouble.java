package main.chapter5.centrality;

import java.util.Arrays;

/**
 * @Author
 * Karol Meksuła
 * 10-07-2018
 * */

public class CentralTendencyDouble implements CentralTendency<Double> {
    private Double result = 0.0;

    @Override
    public Double median(Double[] set) {
        Arrays.sort(set);

        if (set.length % 2 == 0) {
            result = set[(set.length / 2) - 1];
        }

        else {
            result = set[(int) ((set.length / 2) + 0.5)];
        }

        return result;
    }

    @Override
    public Double mode(Double[] set) {
        Double maxValue = 0.0;
        int maxCount = 0;

        for (Double i : set) {         // 1. Iteracja po całym zbiorze
            int count = 0;
            for (Double j : set) {     // 2. Druga pętla, w której porównujemy wyraz do reszty zbioru
                if (j.equals(i)) {           // 3. Zwiększamy licznik
                    count++;
                }
            }
            if (count > maxCount) {                    // 4. Jeśli obecny licznik jest większy niż maksymalny to
                maxCount = count;                      //    ustalamy nową ilość powtórzeń oraz położenie max wartości
                maxValue = i;
            }
        }

        return maxValue;
    }

    @Override
    public Double mean(Double[] set) {
        double sum = 0;

        for (Double aSet : set) {
            sum += aSet;
        }

        return sum / set.length;
    }

    @Override
    public Double predominant(Double[] set) {
        int half = set.length / 2;
        int counter = 0;
        Double value = null;

        for (Double aSet : set) {
            int localCounter = 0;
            for (Double aSet1 : set) {
                if (aSet.equals(aSet1)) {
                    localCounter++;
                }
            }
            if (localCounter > counter) {
                counter = localCounter;
                value = aSet;
            }
        }

        if (counter < half) {
            return Double.NaN;
        }

        return value;
    }

}
