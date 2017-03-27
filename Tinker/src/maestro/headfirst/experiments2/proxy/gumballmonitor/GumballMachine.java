package maestro.headfirst.experiments2.proxy.gumballmonitor;

public class GumballMachine {
	
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	
	State state=soldOutState;

	int count=0;
	
	String location;
	
	public GumballMachine( String location, int numberGumballs){
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		
		this.count=numberGumballs;
		if (numberGumballs>0){
			state=noQuarterState;
		}
		
		this.location = location;
	}
	

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
 
	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
 
	public void refill(int numGumBalls) {
		this.count = numGumBalls;
		state = this.noQuarterState;
	}
	
    public State getState() {
        return this.state;
    }

    public State getSoldOutState() {
        return this.soldOutState;
    }

    public State getNoQuarterState() {
        return this.noQuarterState;
    }

    public State getHasQuarterState() {
        return this.hasQuarterState;
    }

    public State getSoldState() {
        return this.soldState;
    }

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004\n");
		result.append("Inventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\nMachine is "+state+"\n");
				
		return result.toString();
	}


	public State getWinnerState() {
		return this.winnerState;
	}


	public String getLocation() {
		// TODO Auto-generated method stub
		return location;
	}
	


}
