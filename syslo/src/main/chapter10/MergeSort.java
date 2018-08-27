package chapter10;

/**
 * @author
 * Karol Meksu³a
 * 27-08-2018
 * */

public class MergeSort {

	public static int[] merge(int[] setX, int[] setY) {
		int[] mergedSet = new int[setX.length + setY.length];
		
		for(int i = 0; i < mergedSet.length; i++) {
			if (i == 0 || i % 2 == 0) {
				mergedSet[i] = setX[i / 2];
			}
			else {
				mergedSet[i] = setY[i / 2];
			}
			
			if (i > 0 && mergedSet[i] < mergedSet[i - 1]) {
				int tmp = mergedSet[i];
				mergedSet[i] = mergedSet[i - 1];
				mergedSet[i - 1] = tmp;
			}
		}
		
		return mergedSet;
	}
	
	//Correct way
	
	public static int[] merge2(int[] setX, int[] setY) {
		int[] mergedSet = new int[setX.length + setY.length];
		int indicatorX = 0;
		int indicatorY = 0;
		
		for(int i = 0; i < mergedSet.length; i++) {
			if(indicatorX < setX.length && setX[indicatorX] < setY[indicatorY]) {
				mergedSet[i] = setX[indicatorX];
				indicatorX++;
			} else {
				mergedSet[i] = setY[indicatorY];
				indicatorY++;
			}	
		}
		return mergedSet;
	}
	
}
