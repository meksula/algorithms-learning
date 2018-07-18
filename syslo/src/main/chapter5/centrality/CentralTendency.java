package main.chapter5.centrality;

/**
 * @Author
 * Karol Meksuła
 * 10-07-2018
 * */

public interface CentralTendency<T> {
    T median(T[] set);

    T mode(T[] set);

    T mean(T[] set);

    T predominant(T[] set);
}
