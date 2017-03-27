package maestro.headfirst.experiments2.strategy;

public abstract class Duck {
	
	//Declares two reference variables for the
	// behavior interface types.
	// All duck subclasses (in the same 
	// package) inherit these.
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck(){
		
	}
	 
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}

	public abstract void display();

	public void performFly(){
		flyBehavior.fly();
	}

	
	public void performQuack(){
		// delegate to the behavior class
		quackBehavior.quack();
		
	}
	
	public void swim(){
		System.out.println("All ducsk float, even decoys!");
	}
	
}

