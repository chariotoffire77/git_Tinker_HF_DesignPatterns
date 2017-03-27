package maestro.headfirst.experiments2.templatemethod;

public class BeverageTestDrive {

	public static void main(String[] args) {
		// Create a Tea
		TeaWithHook teaHook = new TeaWithHook();
		// Create a Coffee
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
		
		System.out.println("\nMaking Tea...");
		teaHook.prepareRecipe();
		
		System.out.println("\nMaking Coffee...");
		coffeeHook.prepareRecipe();
		
		

	}

}
