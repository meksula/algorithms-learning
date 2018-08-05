package chapter7.hanoi;

/**
 * @Author 
 * Karol Meksu³a
 * 04-08-2018
 * */

public class HanoiTower {
	private int ringsAmount;
	private Stick[] sticks;
	private Ring[] rings;
	
	public HanoiTower(int ringsAmount) {
		this.ringsAmount = ringsAmount;
		
		this.sticks = new Stick[3];
		this.rings = new Ring[ringsAmount];
		init();
	}
	
	public void init() {
		
		for(int i = 0; i < ringsAmount; i++) {
			if(i < 3) {
				sticks[i] = new Stick(i);
			}
			
			Ring ring = new Ring(i);
			
			sticks[0].put(ring);
			rings[i] = ring;
		}
	}
	
	public void moveRing(int from, int to) {
		Ring ring = sticks[from].takeOne();
		boolean swapped = sticks[to].put(ring);
		
		if(swapped) {
			sticks[from].remove(ring);
		}
		
	}
	
	public Stick[] getSticks() {
		return sticks;
	}
	
	public boolean checkout() {
		System.out.println("You won!");
		if(sticks[2].getRings().size() == ringsAmount) {
			return true;
		}
		
		return false;
	}
	
	public void stateView() {
		System.out.println("\n-----------------\n" + sticks[0].toString());
		System.out.println(sticks[1].toString());
		System.out.println(sticks[2].toString());
	}
	
}
