package chapter7.hanoi;

import java.util.*;

/**
 * @Author 
 * Karol Meksu³a
 * 04-08-2018
 * */

public class Stick {
	private int number;
	private List<Ring> rings;
	
	public Stick(int number) {
		this.number = number;
		this.rings = new ArrayList<>();
	}
	
	public Ring takeOne() {
		if(rings.size() == 0) {
			return null;
		}
		
		Ring ring = rings.get(rings.size() - 1);
		return ring;
	}
	
	public void remove(Ring ring) {
		rings.remove(ring);
	}
	
	public boolean put(Ring ring) {
		if(rings.isEmpty()) {
			rings.add(ring);
			return true;
		}
		
		Ring last = rings.get(rings.size() - 1);
	
		if(last.value < ring.value) {
			rings.add(ring);
			return true;
		}
		return false;
	}
	
	public List<Ring> getRings() {
		return rings;
	}
	
	@Override
	public String toString() {
		return "Stick no." + number + " has " + rings.size() + " pieces: " + rings;
	}
	
}
