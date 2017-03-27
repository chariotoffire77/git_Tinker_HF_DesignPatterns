package maestro.headfirst.experiments2.strategy;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		
		mallard.display();
		
		// This calls the MallardDuck's inherited 
		// performQuack method, which then delegates to the
		// object's QuackBehavior (i.e calls quack() on  the duck's
		// inherited quackBehavior reference).
		mallard.performQuack();
		
		// Then we do the same thing with MallardDuck's
		// inherited performFly() method.
		mallard.performFly();
				

	}

}
