package my.headfirst.experiments;

import java.util.ArrayList;

/* class is abstract even though there is 
 * no abstract method
 * becuase we don't want this class
 * instantiated directly.
 */
public abstract class Pizza {

	String name;
	String dough;
	String sauce;
	// Each Pizza has a name, a type of dough, a type of sauce, and a set of toppings
	ArrayList<String> toppings =  new ArrayList<String>();
	
	void prepare(){
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings...");
	}
	
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
}
