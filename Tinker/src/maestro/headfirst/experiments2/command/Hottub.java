package maestro.headfirst.experiments2.command;

public class Hottub {
	
	private String name;
	
	
    public Hottub(String name) {
		
		this.name = name+" ";
	}


    public void on(){
    	System.out.println(name + "Hottub is on");
    }
    
    public void off(){
    	System.out.println(name + "Hottub is off");
    }
}
