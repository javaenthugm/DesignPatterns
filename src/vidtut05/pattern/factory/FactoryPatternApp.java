package vidtut05.pattern.factory;

import java.util.Scanner;

public class FactoryPatternApp {

	/*
	 * public static void main(String args[]){ Scanner in=new
	 * Scanner(System.in); int rounds = 0; while (rounds < 1 || rounds > 3) {
	 * System.out.print("How many rounds? "); if (in.hasNextInt()) { rounds =
	 * in.nextInt(); } else {
	 * System.out.println("Invalid input. Please try again.");
	 * System.out.println(); in.nextLine(); // to clear Scanner }
	 * 
	 * } System.out.print(rounds+" rounds."); }
	 */

	public static void main(String args[]) {
		EnemyShip enemyShip = null;
		Scanner userInput = new Scanner(System.in);
		System.out.println("What type of Ship u/r/b?");
		if(userInput.hasNextLine()){
			String typeOFShString = userInput.nextLine();
			enemyShip = new EnemyShipFactory().makeEnemyShip(typeOFShString);
			doSomeStuff(enemyShip);
		}
	}
	
	public static void doSomeStuff(EnemyShip newEnemyShip){
		newEnemyShip.displayEnemyShip();
		newEnemyShip.doDamage();
	}
}
