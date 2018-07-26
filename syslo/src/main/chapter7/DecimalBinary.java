package chapter7;

/**
 * @Author 
 * Karol Meksu³a
 * 25-07-2018
 * */

public class DecimalBinary {
	
	public static String toBinary(int arg) {
		StringBuilder resultBuilder = new StringBuilder();
				
		while(arg != 0) {
			if(arg % 2 == 0) {
				resultBuilder.append("0");
			}
			else {
				resultBuilder.append("1");
			}
			
			arg = arg / 2;
		}
		
		return resultBuilder.reverse().toString();
	}
	
}
