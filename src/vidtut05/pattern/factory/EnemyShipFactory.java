package vidtut05.pattern.factory;

public class EnemyShipFactory {

	private EnemyShip enemyShip = null;

	public EnemyShip makeEnemyShip(String name) {

		if (name.equalsIgnoreCase("U")) {
			enemyShip = new UFOShip();
		} else if (name.equalsIgnoreCase("R")) {
			enemyShip = new RocketShip();
		} else if (name.equalsIgnoreCase("B")) {
			enemyShip = new BigUFOShip();
		}

		return enemyShip;
	}

}
