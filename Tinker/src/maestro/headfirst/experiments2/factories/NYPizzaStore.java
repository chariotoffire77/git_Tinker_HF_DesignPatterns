package maestro.headfirst.experiments2.factories;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		
		Pizza pizza = null;
		
		PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
		if ( type.equals("cheese")){
			pizza =  new CheesePizza(pizzaIngredientFactory);
			pizza.setName( "NY Style Cheese Pizza");
		} else if ( type.equals("veggie")){
			pizza =  new VeggiePizza(pizzaIngredientFactory);
			pizza.setName( "NY Style Veggie Pizza");
		}
		return pizza;
	}
	
	

}
