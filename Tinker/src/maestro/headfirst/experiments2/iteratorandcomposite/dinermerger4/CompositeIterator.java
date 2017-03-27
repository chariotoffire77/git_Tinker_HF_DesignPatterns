package maestro.headfirst.experiments2.iteratorandcomposite.dinermerger4;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<Object> {
	
	Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();
	
	public CompositeIterator(Iterator<MenuComponent> iterator){
		stack.push(iterator);
	}

	@Override
	public Object next() {
		if (hasNext()){
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent menuComponent = iterator.next();
			
			if ( menuComponent instanceof Menu ){
				stack.push(menuComponent.createIterator());
			}
			return menuComponent;
			
		}else{
			return null;
		}
		
	}

	@Override
	public boolean hasNext() {
		if ( stack.empty()){
			return false;
		}else{
			Iterator<MenuComponent> iterator = stack.peek();
			if( !iterator.hasNext()){
				stack.pop();
				return hasNext();
			}else{
				return true;
			}
		}
		
	}
	
	public void remove(){
		throw new UnsupportedOperationException();
	}

}
