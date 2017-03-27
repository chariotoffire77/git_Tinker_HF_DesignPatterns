package maestro.headfirst.experiments2.iterator.dinermerger2;

public class MenuTestDrive {

	public static void main(String[] args) {
		Menu pancakeHouseMenu = new PancakeHouseMenu();
		Menu dinerMenu = new DinerMenu();
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		
		waitress.printMenu();

	}

}
