package maestro.headfirst.experiments2.factories;

import java.util.ArrayList;

/* class is abstract even though there is 
 * no abstract method
 * becuase we don't want this class
 * instantiated directly.
 */
public abstract class Pizza {

	String name;
	
	/*
	 * Each Pizza holds a set of ingredients that are used in its preparation
	 */
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	Clams  clam;
	Pepperoni pepperoni;
	
	// Each Pizza has a name, a type of dough, a type of sauce, and a set of toppings
	Veggies[] toppings =  null;
	
	/* we have now made the prepare method abstract
	 *  this is where we are going to collect the 
	 *  ingredients needed for the pizza, which of
	 *  course will come from the ingredient factory
	 * 
	 */
	/*
	abstract void prepare(){
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings...");
	}
	
	*/
	abstract void prepare();
	
	void bake(){
		System.out.println("Bake for 25 minutes at 350");
	}
	
	void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box(){
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName(){
		return name;
	}
	
	public void setName( String name){
		this.name = name;
	}
}
