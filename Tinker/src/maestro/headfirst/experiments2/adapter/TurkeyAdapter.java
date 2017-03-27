/**
 * Now, let's say you're short on Duck objects and you'd like
 * to use some Turkey objects in their place. Obviously we can't
 * use the turkeys outright because they have a different interface.
 * 
 * So, let's write an Adapter
 */
package maestro.headfirst.experiments2.adapter;

/**
 * @author chariotoffire77
 * First you need to implement the interface of the 
 * type you're adapting to. This is the interface
 * your client expects to see.
 */
public class TurkeyAdapter implements Duck {
	
	private Turkey turkey;

	/*
	 * Next, we need to get a reference to the object
	 * that we're adapting; here we do that through the
	 * constructor.
	 */
	public TurkeyAdapter ( Turkey turkey){
		this.turkey = turkey;
	}

	/* Now we need to implement all the methods in the interface,
	 * the quack() translation between classes is easy; just call gobble()
	 * method
	 * 
	 */
	@Override
	public void quack() {
		turkey.gobble();

	}

	/* 
	 * Even though both interfaces have a fly()
	 * method, Turkeys fly short spurts - they can't
	 * do long-distance flying like ducks. To map between
	 * a Duck's fly() method and a Turkey's, we need to call
	 * the Turkey's fly() method 5 times to make up for it.
	 * 
	 */
	@Override
	public void fly() {
		for (int i=0; i<5; i++){
			turkey.fly();
		}
		
	}

}
