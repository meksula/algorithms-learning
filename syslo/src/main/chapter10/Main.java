package chapter10;

/**
 * @author
 * Karol Meksu�a
 * 27-08-2018
 * */

public class Main {

	public static void main(String[] args) {
		int[] setX = {3,7,11,19,23,72,92};
		int[] setY = {1,9,24,63,82,91,95};
		
		int[] result = MergeSort.merge2(setX, setY);
		
		System.out.println("Wynik scalania dw�ch ci�g�w uporz�dkowanych:\n");
		
		for(int i : result) {
			System.out.print(i + ", ");
		}
	}
	
}
