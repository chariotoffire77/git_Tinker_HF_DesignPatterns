package maestro.headfirst.experiments2.iteratorandcomposite.dinermerger4;

import java.util.Iterator;

public class Waitress2 {
	
	MenuComponent allMenus;

	
	public Waitress2(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
	
	public void printMenu(){
		
		this.allMenus.print();
		
	}
	
	public void printVegetarianMenu(){
		Iterator<MenuComponent> iterator = allMenus.createIterator();
		
		System.out.println("\nVEGETARIAN MENU\n----");
		while ( iterator.hasNext()){
			MenuComponent menuComponent = iterator.next();
			
			try {
				if (menuComponent.isVegetarian()){
					menuComponent.print();
				}
			}catch (UnsupportedOperationException e){
				
			}
		}
	}

}
