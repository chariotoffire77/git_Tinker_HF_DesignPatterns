package maestro.headfirst.experiments2.iteratorandcomposite.dinermerger4;

import java.util.Iterator;

public class NullIterator implements Iterator {

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void remove(){
		throw new UnsupportedOperationException();
	}


}
