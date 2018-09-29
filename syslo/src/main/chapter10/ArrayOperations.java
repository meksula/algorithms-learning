package main.chapter10;

import java.util.Random;

/**
 * @author
 * Karol Meksuła
 * 29-09-2018
 * */

public class ArrayOperations {

    public static int[] shuffleIntsArrays(int[] array) {
        Random random = new Random();

        for (int i = 0; i < 2; i++) {
            int index = 0;
            for (int value : array) {
                int randomIndex = random.nextInt(array.length);
                int replaced = array[index];
                array[index] = array[randomIndex];
                array[randomIndex] = replaced;
                index++;
            }
            i++;
        }

        return array;
    }

}
