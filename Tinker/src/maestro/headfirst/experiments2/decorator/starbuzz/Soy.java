package maestro.headfirst.experiments2.decorator.starbuzz;

public class Soy extends CondimentDecorator {
	
	Beverage beverage;
	
	Soy( Beverage beverage ){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		
		return this.beverage.getDescription() + ", Soy";
	}
	
	public double cost(){
		return .15 + this.beverage.cost();
	}
	

}
