package maestro.headfirst.experiments2.decorator.starbuzz;

public class Whip extends CondimentDecorator {
	
	Beverage beverage;
	
	Whip( Beverage beverage ){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		
		return this.beverage.getDescription() + ", Whip";
	}
	
	public double cost(){
		return .10 + this.beverage.cost();
	}
	

}
