package maestro.headfirst.experiments2.templatemethod;

public class BeverageTestDrive2 {

	public static void main(String[] args) {
		// Create a Tea
		CaffeineBeverageWithHook teaHook = new TeaWithHook();
		// Create a Coffee
		CaffeineBeverageWithHook coffeeHook = new CoffeeWithHook();
		
		System.out.println("\nMaking Tea...");
		teaHook.prepareRecipe();
		
		System.out.println("\nMaking Coffee...");
		coffeeHook.prepareRecipe();
		
		

	}

}
