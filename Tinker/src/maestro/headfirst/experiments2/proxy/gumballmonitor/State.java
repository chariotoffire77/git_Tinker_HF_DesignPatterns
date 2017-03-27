package maestro.headfirst.experiments2.proxy.gumballmonitor;

public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
