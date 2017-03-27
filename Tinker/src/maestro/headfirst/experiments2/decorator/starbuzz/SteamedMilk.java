package maestro.headfirst.experiments2.decorator.starbuzz;

public class SteamedMilk extends CondimentDecorator {
	
	Beverage beverage;
	
	SteamedMilk( Beverage beverage ){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		
		return this.beverage.getDescription() + ", Steamed Milk";
	}
	
	public double cost(){
		return .10 + this.beverage.cost();
	}
	

}
