package maestro.headfirst.experiments2.state.gumballstatewinner;

import java.util.Random;

public class HasQuarterState implements State {
	Random randomWinner = new Random(System.currentTimeMillis());
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
		int winner = randomWinner.nextInt(10);
		
		System.out.format("LOTTERY NUMBER=%d, %s%n",
				winner, (winner==0?"You picked the lottery number..": "You did not pick the lottery number"));
		//System.out.println("You picked...."+winner);
		if ( (0 == winner) && (gumballMachine.getCount() > 1)){
			this.gumballMachine.setState(this.gumballMachine.getWinnerState());
		}else{
			this.gumballMachine.setState(this.gumballMachine.getSoldState());	
		}
		
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
