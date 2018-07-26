package chapter7;

/**
 * @Author 
 * Karol Meksu³a
 * 25-07-2018
 * */

// prosty algorytm Euklidesa szuka najwiêkszego wspólnego dzielnika miêdzy dwoma liczbami

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
	
	//algorytm obliczaj¹cy najwiêksz¹ wspóln¹ wielokrotnoœæ dwóch liczb
	public static int nww(int x, int y) {
		int wd = EuklidesAlgorith.euklides(x, y);
		
		int bigger = Integer.max(x, y);
		int lower = Integer.min(x, y);
		
		return bigger * (lower / wd);
	}
	
}
