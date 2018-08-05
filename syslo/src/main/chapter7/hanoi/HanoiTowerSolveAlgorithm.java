package chapter7.hanoi;

/**
 * @Author 
 * Karol Meksu³a
 * 04-08-2018
 * */

public class HanoiTowerSolveAlgorithm {
	private HanoiTower hanoi;
	private int counter = 0;
	
	public static void main(String[] args) {
		HanoiTower hanoiTower = new HanoiTowerSolveAlgorithm().solve(3);
		hanoiTower.stateView();
	}
	
	public HanoiTower solve(int rings) {
		this.hanoi = new HanoiTower(rings);
		
		moveRing(rings, hanoi.getSticks()[0], hanoi.getSticks()[1], hanoi.getSticks()[2]);
		return hanoi;
	}
	
	public void moveRing(int rings, Stick from, Stick to, Stick helper) {
		if(rings == 1) {
			counter++;
			Ring ring = from.takeOne();
			from.remove(ring);
			to.put(ring);
		}
		else {
			moveRing(rings - 1, from, helper, to);
			moveRing(1, from, to, helper);
			moveRing(rings - 1, helper, to, from);
		}
		
		System.out.println("\nAfter move no. " + counter);
		hanoi.stateView();
	}
	
}
