package main.chapter5;

/**
 * @Author
 * Karol Meksuła
 * 06-07-2018
 * */

public class MinMax implements MinMaxAlgorithm {
    int[] numberSet = {-2, 1, 0, 3, 4, 23, 5, 22, 40, 992, 2, 3, 5, 37, 87, 1000};
    int[] min = new int[numberSet.length / 2];
    int[] max = new int[numberSet.length / 2];

    public void minmax() {
        int a;
        int b;

        for (int i = 0; i < numberSet.length / 2; i++) {
            if (numberSet.length % 2 == 0) {
                a = numberSet[i];
                b = numberSet[(numberSet.length - 1) - i];

                if (a < b) {
                    min[i] = a;
                    max[i] = b;
                } else {
                    min[i] = b;
                    max[i] = a;
                }

            }

        }

    }

    public int minFunction() {
        warn();
        int minimum = min[0];

        for (int i : min) {
            if (i < minimum) {
                minimum = i;
            }
        }

        return minimum;
    }

    public int maxFunction() {
        warn();
        int maximum = max[0];

        for (int i : min) {
            if (i > maximum) {
                maximum = i;
            }
        }

        return maximum;
    }

    private void warn() {
        if (numberSet.length == 0) {
            System.out.println("Zbiór pusty.");
        }

        if (max.length == 0 && min.length == 0) {
            System.out.println("Najpierw wykonaj metodę `minmax()`");
        }
    }

    @Override
    public int getMax(int[] numberSet) {
        this.numberSet = numberSet;
        minmax();

        return maxFunction();
    }

    @Override
    public int getMin(int[] numberSet) {
        this.numberSet = numberSet;
        minmax();

        return minFunction();
    }

    public static void main(String[] args) {
        MinMax minMax = new MinMax();
        minMax.minmax();

        System.out.print("Min set: ");
        for (int i : minMax.min) {
            System.out.print(i + ", ");
        }

        System.out.println();
        System.out.print("Max set: ");
        for (int i : minMax.max) {
            System.out.print(i + ", ");
        }

        System.out.println();
        System.out.println("Największy element zbioru: " + minMax.maxFunction());
        System.out.println("Najmniejszy element zbioru: " + minMax.minFunction());
        System.out.println("---------------------------------------------------");
    }

}
