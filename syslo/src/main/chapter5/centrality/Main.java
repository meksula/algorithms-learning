package main.chapter5.centrality;

/**
 * @Author
 * Karol Meksuła
 * 10-07-2018
 * */

public class Main {

    public static void main(String[] args) {
        //Dla testu mediany i mody
        //Double[] set = {9.0, 5.4, 9.7, 5.4, 1.8, 1.8, 2.2, 6.5, 11.3, 9.3, 8.3, 5.4};

        // Dla testu lidera
        Double[] set = {9.0, 5.4, 9.7, 5.4, 1.8, 1.8, 2.2, 6.5, 11.3, 9.3, 8.3, 5.4, 5.4, 5.4, 5.4, 5.4, 5.4};

        CentralTendency<Double> centralTendency = new CentralTendencyDouble();
        Double setMean = centralTendency.mean(set);
        Double setMedian = centralTendency.median(set);
        Double setMode = centralTendency.mode(set);
        Double setPredominant = centralTendency.predominant(set);

        System.out.println("Mean: " + setMean);
        System.out.println("Median: " + setMedian);
        System.out.println("Mode: " + setMode);
        System.out.println("Predominant: " + setPredominant);
    }

}
