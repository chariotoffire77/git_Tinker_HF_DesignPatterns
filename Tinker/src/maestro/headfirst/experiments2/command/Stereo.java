package maestro.headfirst.experiments2.command;

public class Stereo {
	
	private String name;
	
	
    public Stereo(String name) {
		
		this.name = name+" ";
	}

	public void on(){
    	System.out.println(name + "stereo is on");
    }
    
    public void off(){
    	System.out.println(name+ "stero is off");
    }

	public void setCD() {
		System.out.println(name+ "stereo is set for CD input");
		
	}

	public void setVolume(int i) {
		System.out.println(name+"stereo CD volume is set to "+i);
		
	}
}
