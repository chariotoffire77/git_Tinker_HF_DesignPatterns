package maestro.headfirst.experiments2.proxy.gumballmonitor;

public class WinnerState implements State {
	
	GumballMachine gumballMachine;
	
	

	public WinnerState(GumballMachine gumballMachine) {
		
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a Gumball");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("Please wait, we're already giving you a Gumball");

	}

	@Override
	public void turnCrank() {
		System.out.println("Turning again doesn't get you another gumball!");
	}
	
	




	@Override
	public void dispense() {
		System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");

		this.gumballMachine.releaseBall();
		if (this.gumballMachine.getCount() == 0) {
			this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
		} else {
			this.gumballMachine.releaseBall();
			if (this.gumballMachine.getCount() > 0) {
				this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
			} else {
				System.out.println("Oops, out of gumball");
				this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
			}
		}

	}
	

	public String toString() {
		return "YOU'RE A WINNER! You get two gumballs for your quarter";
		

	}

}
