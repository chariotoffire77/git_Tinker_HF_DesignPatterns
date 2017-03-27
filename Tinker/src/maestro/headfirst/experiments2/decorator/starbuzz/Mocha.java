package maestro.headfirst.experiments2.decorator.starbuzz;

public class Mocha extends CondimentDecorator {
	
	Beverage beverage;
	
	Mocha( Beverage beverage ){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		
		return this.beverage.getDescription() + ", Mocha";
	}
	
	public double cost(){
		return .20 + this.beverage.cost();
	}
	

}
