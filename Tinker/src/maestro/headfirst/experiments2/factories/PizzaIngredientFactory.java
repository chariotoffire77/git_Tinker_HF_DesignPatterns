package maestro.headfirst.experiments2.factories;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Clams createClams();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
	Cheese createCheese();
}
