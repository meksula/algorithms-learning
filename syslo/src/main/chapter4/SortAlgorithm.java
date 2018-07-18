package main.chapter4;

/**
 * @Author
 * Karol Meksuła
 * 26-03-2018
 * */

public class SortAlgorithm {
    static int[] tablica = {13, -42, -234, 102, 32, 55, 13467, 2, -1, 4,
    24,625,3421,55523,256,124,6773,145,66,872,266,721,-10,103,-945,-213,149,0,
    35,567,6,146,147,1};

    public static void main(String[]args) {
        System.out.println("Table length: " + tablica.length);
        sort(tablica);
        print("Wynik: ");
    }

    public static boolean checkout(int[] tab) {
        boolean flag = true;
        for (int i = 0; i < tab.length; i++) {
            int compareIndex = i + 1;

            if (compareIndex < tab.length) {
                if (tab[i] < tab[compareIndex]) {
                    flag = true;
                } else return false;
            }
        }

        return flag;
    }

    private static void print(String info) {
        System.out.println(System.lineSeparator() + info);
        for (int tab : tablica) System.out.print(tab + ", ");
    }

    public static void sort(int [] tab) {
        int compareCounter = 0;
        boolean flag = false;
        while (!flag) {
            for (int i = 0; i < tab.length; i++) {
                int compareIndex = i + 1;

                if (compareIndex < tab.length) {
                    if (tab[i] > tab[compareIndex]) {
                        replace(i, compareIndex);
                        compareCounter++;
                    }
                }
            }
            flag = checkout(tab);
        }
        System.out.println("Final number of comparsion: " + compareCounter);
    }

    private static void replace(int x, int y) {
        int a = tablica[x];
        int b = tablica[y];
        tablica[x] = b;
        tablica[y] = a;
    }
}
