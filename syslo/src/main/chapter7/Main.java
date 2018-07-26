package chapter7;

/**
 * @Author 
 * Karol Meksu�a
 * 25-07-2018
 * */

public class Main {
	public static void main(String[] args) {
		String binary = DecimalBinary.toBinary(1993);
		System.out.println("binary: " + binary);
		
		int d = EuklidesAlgorith.euklides(9, 3);
		System.out.println("\nNajwi�kszy wsp�lny dzielnik: " + d);
		
		int nww = EuklidesAlgorith.nww(2, 29);
		System.out.println("\nNajmniejsza wsp�lna wielokrotno��: " + nww);
	}
}