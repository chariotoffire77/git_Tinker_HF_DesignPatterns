package maestro.headfirst.experiments2.state.gumballstate;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		this.gumballMachine.setState(gumballMachine.getNoQuarterState());

	}

	@Override
	public void turnCrank() {
		System.out.println("You turned...");
		this.gumballMachine.setState(gumballMachine.getSoldState());
		//this.gumballMachine.getSoldState().dispense();

	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
		
	}
	
	public String toString(){
		return "waiting for turn of crank";
	}

}
