package maestro.headfirst.experiments2.command;

public class GarageDoor {
	
	private String name;
	
	
    public GarageDoor(String name) {

		this.name = name;
	}

	public void up(){
    	System.out.println("Garage door is Up.");
    }
    
    public void down(){
    	System.out.println("Garage door is Down.");
    }
}
