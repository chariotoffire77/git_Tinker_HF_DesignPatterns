package maestro.headfirst.experiments2.decorator.starbuzz;

public class StarbuzzCoffee  {

	
    public static void main (String [] args){
    	Beverage beverage = new Espresso();
    	
    	// Order an Espresso no condiments and print its description and cost
    	System.out.println(beverage.getDescription()+" $"+beverage.cost());
    	
    	
    	// Make a DarkRoast object
    	Beverage beverage2 = new DarkRoast();
    	// Wrap or decorate the DarkRoast object with a Mocha
    	beverage2 = new Mocha( beverage2 );
    	// Wrap it with a second Mocha
    	// i.e. DarkRoast + Mocha + Mocha
    	beverage2 = new Mocha( beverage2 );
    	// Wrap it Whip
    	// i.e. DarkRoast + Mocha + Mocha + Whip
    	beverage2 = new Whip( beverage2 );
    	
    	System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
    	
    	
    }

}
