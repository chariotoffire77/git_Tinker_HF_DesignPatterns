package maestro.headfirst.experiments2.command;

public class CeilingFan {

	private String location;
	private int speed;
	
	

	public static final int HIGH=3;
	public static final int MEDIUM=2;
	public static final int LOW=1;
	public static final int OFF=0;
	
	
    public CeilingFan(String location) {
		
		this.location = location+" ";
	}

    public void off(){
    	System.out.println(location+ "Ceiling Fan is off");
    	speed = OFF;
    }

	public void high(){
		System.out.println(location + "Ceiling Fan is on high");
		speed = HIGH;
	}
	
	public void medium(){
		System.out.println(location + "Ceiling Fan is on medium");
		speed = MEDIUM;
	}
	
	public void low(){
		//code to set fan to low
		System.out.println(location + "Ceiling Fan is on low");
		speed = LOW;
	}
	
	public int getSpeed() {
		System.out.println(location+"Ceiling Fan speed is "+speed);
		return speed;
	}

}
