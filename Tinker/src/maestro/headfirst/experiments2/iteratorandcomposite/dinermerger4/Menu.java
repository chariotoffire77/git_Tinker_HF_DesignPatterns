package maestro.headfirst.experiments2.iteratorandcomposite.dinermerger4;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    ArrayList <MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    String name;
    String description;
    
    Iterator iterator = null;
    
    public Menu( String name, String description ){
    	this.name = name;
    	this.description = description;
    }
    
    public void add(MenuComponent menuComponent){
		menuComponents.add(menuComponent);
	}
	
	public void remove(MenuComponent menuComponent){		
		menuComponents.remove(menuComponent);
	}
	
	public MenuComponent getChild(int i){
		return menuComponents.get(i);
	}
	
	public String getName(){
		return this.name;
	}
	public String getDescription(){
		return this.description;
	}
	
	public void print(){
		System.out.print("\n"+getName());
		System.out.println(", "+getDescription());
		System.out.println("---------------------");
		
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		
		while(iterator.hasNext()){
			MenuComponent menuComponent = iterator.next();
			menuComponent.print();
		}
	}
	
	public Iterator<?> createIterator(){
		if (iterator == null){
			iterator = new CompositeIterator(menuComponents.iterator());
		}
		return iterator;
	}
}
