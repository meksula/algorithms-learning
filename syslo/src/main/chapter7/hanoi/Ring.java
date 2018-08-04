package chapter7.hanoi;

/**
 * @Author 
 * Karol Meksu�a
 * 04-08-2018
 * */

public class Ring {
	public int value;
	
	public Ring(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Ring value: " + value;
	}
	
}
