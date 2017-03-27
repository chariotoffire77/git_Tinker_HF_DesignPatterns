package maestro.headfirst.experiments2.templatemethod;

public class Duck implements Comparable<Duck> {
	
	String name;
	int weight;
	
	public Duck (String name, int weight){
		this.name = name;
		this.weight = weight;
	}
	
	public String toString( ){
		return name +" weighs " + weight;
	}

	@Override
	public int compareTo(Duck o) {
		// TODO Auto-generated method stub
		if (this.weight < o.weight){
			return -1;
		}else if (this.weight == o.weight){
			return 0;
		}else{
			return 1;
		}
		
	}

}
