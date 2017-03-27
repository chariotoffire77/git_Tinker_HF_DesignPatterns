package maestro.headfirst.experiments2.factories;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		
		return new PlumTomatoSauce();
	}

	@Override
	public Clams createClams() {
		return new FrozenClams();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = {new BlackOlives(), new EggPlant(), new Spinach()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		
		return new SlicedPepperoni();
	}

	@Override
	public Cheese createCheese() {
		
		return new MozzarellaCheese();
	}

}
