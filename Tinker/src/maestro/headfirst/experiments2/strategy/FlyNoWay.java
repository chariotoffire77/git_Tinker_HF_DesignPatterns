package maestro.headfirst.experiments2.strategy;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		// Flying behavior implementation for ducks
		// that do NOT fly (like
		// rubber ducks and decoy ducks).
		System.out.println("I can't fly");
	}

}
