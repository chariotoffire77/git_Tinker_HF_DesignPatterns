package maestro.headfirst.experiments2.strategy;

public class MallardDuck extends Duck {

	public MallardDuck(){
		
		// Remember, MallardDuck inherits the quack
		// Behavior and flyBehavior instance variables
		// from class Duck
		
		// A MallardDuck uses the Quack class
		// to handle its quack, so when 
		// performQuack is called responsibility 
		// for the quack is delegated to the 
		// Quack object and we get a real quack.
		quackBehavior = new Quack();
		
		// And it uses FlyWithWings as its FlyBehavior type
		flyBehavior = new FlyWithWings();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("\nI'm a real Mallard duck");
        
	}

}
