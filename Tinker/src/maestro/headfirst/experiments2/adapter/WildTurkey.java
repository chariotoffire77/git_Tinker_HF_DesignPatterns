package maestro.headfirst.experiments2.adapter;

public class WildTurkey implements Turkey {

	/*
	 * Here is a concrete implementation of Turkey,
	 * like Duck, it just print out its actions
	 */
	@Override
	public void gobble() {
		System.out.println("Gobble gobble");

	}

	@Override
	public void fly() {
		
		System.out.println("I'm flying a short distance.");

	}

}
