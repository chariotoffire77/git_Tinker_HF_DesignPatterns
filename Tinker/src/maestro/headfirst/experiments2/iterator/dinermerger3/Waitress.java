package maestro.headfirst.experiments2.iterator.dinermerger3;

import java.util.Iterator;

public class Waitress {
	
	Menu pancakeHouseMenu;
	Menu dinerMenu;
	Menu cafeMenu;
	
	
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}
	
	public void printMenu(){
		Iterator<?> pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator<?> dinerIterator = dinerMenu.createIterator();
		Iterator<?> cafeIterator = cafeMenu.createIterator();
		
		System.out.println("MENU\n----\nBREAKFAST");
		
		printMenu( pancakeIterator );
		System.out.println("\nLUNCH");
		printMenu( dinerIterator );
		
		System.out.println("\nDiner");
		printMenu( cafeIterator );
		
	}
	
	private void printMenu( Iterator<?> iterator ){
		while (iterator.hasNext()){
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
			
		}
	}
	
	public void printVegetarianMenu(){
		printVegetarianMenu( pancakeHouseMenu.createIterator());
		printVegetarianMenu( dinerMenu.createIterator());
		printVegetarianMenu( cafeMenu.createIterator());
	}
	
	public boolean isItemVegetarian(String name){
		Iterator<?> breakfastIterator = pancakeHouseMenu.createIterator();
		if (isVegetarian(name, breakfastIterator)){
			return true;
		}		
		
		Iterator<?> dinnerIterator = dinerMenu.createIterator();
		if (isVegetarian(name, dinnerIterator)){
			return true;
		}
		
		Iterator<?> cafeIterator = dinerMenu.createIterator();
		if (isVegetarian(name, cafeIterator)){
			return true;
		}

	    return false;
		
	}
	
	private void printVegetarianMenu( Iterator<?> iterator ){
		while(iterator.hasNext()){
			MenuItem menuItem = (MenuItem)iterator.next();
			if ( menuItem.isVegetarian()){
				System.out.print(menuItem.getName());
				System.out.println("\t\t" + menuItem.getPrice());
				System.out.println("\t" + menuItem.getDescription());
			}
		}
	}
	
	private boolean isVegetarian(String name, Iterator<?> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			if (menuItem.getName().equals(name)) {
				if (menuItem.isVegetarian()) {
					return true;
				}
			}
		}
		return false;
	}

}
