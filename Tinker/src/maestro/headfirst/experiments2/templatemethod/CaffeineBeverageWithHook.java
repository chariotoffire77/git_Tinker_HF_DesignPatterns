package maestro.headfirst.experiments2.templatemethod;

public abstract class CaffeineBeverageWithHook {
	
	final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()){
			addCondiments();
		}
	}
	
	abstract void brew();
	abstract void addCondiments();
	
	
	void boilWater() {
		System.out.println("Boiling water");
	}
	
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	/*
	 * Here we have defined a method with (mostly) empty
	 * default implementation.
	 * This method just returns true and does nothing else
	 *  
	 *   This is a hook because the subclass can override this method,
	 *   but doesn't have to.
	 */
	boolean customerWantsCondiments(){
		return true;
	}

}
