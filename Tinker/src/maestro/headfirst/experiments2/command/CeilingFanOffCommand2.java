package maestro.headfirst.experiments2.command;

public class CeilingFanOffCommand2 implements Command {
	
	private CeilingFan ceilingFan;
	
	public CeilingFanOffCommand2( CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		this.ceilingFan.off();
		
	}
	
	public void undo() {
		this.ceilingFan.high();
		
	}

}
