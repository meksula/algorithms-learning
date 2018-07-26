package chapter7;

/**
 * @Author 
 * Karol Meksu�a
 * 25-07-2018
 * */

// prosty algorytm Euklidesa szuka najwi�kszego wsp�lnego dzielnika mi�dzy dwoma liczbami

public class EuklidesAlgorith {
	
	public static int euklides(int x, int y) {
		while(x > 0 && y > 0) {
			if(x > y) {
				x = x % y;
			}
			else {
				y = y % x;
			}
		}
		
		return x + y;
	}
	
	//algorytm obliczaj�cy najwi�ksz� wsp�ln� wielokrotno�� dw�ch liczb
	public static int nww(int x, int y) {
		int wd = EuklidesAlgorith.euklides(x, y);
		
		int bigger = Integer.max(x, y);
		int lower = Integer.min(x, y);
		
		return bigger * (lower / wd);
	}
	
}
