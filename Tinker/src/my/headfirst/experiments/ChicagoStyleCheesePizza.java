package my.headfirst.experiments;

public class ChicagoStyleCheesePizza extends Pizza{
	
	public ChicagoStyleCheesePizza(){
		
		name = "Chicago Style Sauce and Cheese Pizza";
		
		dough = "Extra Thick Crust Dough";
		
		sauce = "Plum Tomator Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
		
	}
	
	void cut(){
		System.out.println("Cutting the pizza into square slices");
	}
	
}
