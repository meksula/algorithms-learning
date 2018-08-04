package chapter7.hanoi;

/**
 * @Author 
 * Karol Meksu³a
 * 04-08-2018
 * */

public class HanoiTowerSolveAlgorithm {

	public static void main(String[] args) {
		HanoiTower hanoiTower = new HanoiTowerSolveAlgorithm().solve(3);
		hanoiTower.stateView();
	}
	
	public HanoiTower solve(int rings) {
		HanoiTower hanoi = new HanoiTower(rings);
		
		hanoi.checkout();
		
		int origin = 1;
		int helper = 2;
		int aim = 3;
		
		
		return hanoi;
	}
	
}
