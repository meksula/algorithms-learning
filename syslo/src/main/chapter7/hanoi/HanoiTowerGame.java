package chapter7.hanoi;

import java.util.Scanner;

/**
 * @Author 
 * Karol Meksu³a
 * 04-08-2018
 * */

public class HanoiTowerGame {

	/** Example of command:
		 * If you want to move Ring from Stick 1 to Stick 3 enter:
		 * `1->3` 
		 * */
	
	public static void main(String[] args) {
		HanoiTower hanoi = new HanoiTower(3);
		hanoi.stateView();
		boolean gameOn = true;
		Scanner scanner = new Scanner(System.in);
		
		while(gameOn) {
			try {
				String command = scanner.nextLine();
				String[] elements = command.split("->");
				int from = Integer.parseInt(elements[0]);
				int to = Integer.parseInt(elements[1]);
			
			hanoi.moveRing(from,  to);
			hanoi.stateView();
			} catch(RuntimeException e) {
				continue;
			}
			
			gameOn = !hanoi.checkout();
		}
		
		scanner.close();
	}
	
}
