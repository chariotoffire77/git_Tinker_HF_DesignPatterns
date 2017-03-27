package maestro.headfirst.experiments2.factories;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
		if ( type.equals("cheese")){
			pizza =  new CheesePizza(pizzaIngredientFactory);
			pizza.setName( "Chicago Style Cheese Pizza");
		} else if ( type.equals("veggie")){
			pizza =  new VeggiePizza(pizzaIngredientFactory);
			pizza.setName( "Chicago Style Veggie Pizza");
		}
		return pizza;
	}
	
	

}
