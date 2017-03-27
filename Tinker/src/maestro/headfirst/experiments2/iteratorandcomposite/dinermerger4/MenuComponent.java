package maestro.headfirst.experiments2.iteratorandcomposite.dinermerger4;

import java.util.Iterator;

public abstract class MenuComponent {
	
	public void add(MenuComponent menComponent){
		throw new UnsupportedOperationException();
	}
	
	public void remove(MenuComponent menComponent){
		throw new UnsupportedOperationException();
	}
	
	public MenuComponent getChild(int i){
		throw new UnsupportedOperationException();
	}
	public String getName(){
		throw new UnsupportedOperationException();
	}
	public String getDescription(){
		throw new UnsupportedOperationException();
	}
	public double getPrice(){
		throw new UnsupportedOperationException();
	}
	public boolean isVegetarian(){
		throw new UnsupportedOperationException();
	}
	public void print(){
		throw new UnsupportedOperationException();
	}
	
	public abstract Iterator createIterator();

}
