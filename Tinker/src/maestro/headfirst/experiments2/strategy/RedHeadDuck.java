package maestro.headfirst.experiments2.strategy;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("\nI'm a real Red Headed duck");
	}
}
