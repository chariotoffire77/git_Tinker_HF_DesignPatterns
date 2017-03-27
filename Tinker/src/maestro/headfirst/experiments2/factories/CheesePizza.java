package maestro.headfirst.experiments2.factories;

public class CheesePizza extends Pizza {
	
	PizzaIngredientFactory pizzaIngredientFactory;
	
	/*
	 * To make a pizza, now we need a factory to provide the ingredients
	 * So each Pizza class gets a factory passed into its
	 * constructor, and it's stored in an instance variable.
	 */
	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
		
		this.pizzaIngredientFactory = pizzaIngredientFactory;
		
		/*
		name = "NY Style Sauce and Cheese Pizza";
		
		dough = "Thin Crust Dough";
		
		sauce = "Marina Sauce";
		
		toppings.add("Grated Reggiano Cheese");
		
		*/
		
	}
	
	void prepare(){
		System.out.println("Preparing "+name);
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		cheese = pizzaIngredientFactory.createCheese();	
		toppings = pizzaIngredientFactory.createVeggies();
		
		System.out.println("Adding toppings...");
		for (int i=0; toppings != null && i<toppings.length; i++){
			System.out.print(toppings[i]);
		}
		System.out.println("");
		
	}
	
}
