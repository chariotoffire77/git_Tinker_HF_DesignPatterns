package maestro.headfirst.experiments2.proxy.gumballmonitor;

public class GumballMonitor {
    GumballMachine machine;

	public GumballMonitor(GumballMachine machine) {
		super();
		this.machine = machine;
	}
    
    public void report(){
    	System.out.println("Gumball Machine: " + machine.getLocation());
    	System.out.println("Current Inventory: " + machine.getCount() + " gumballs");
    	System.out.println("Current state: " + machine.getState());
    }
}
