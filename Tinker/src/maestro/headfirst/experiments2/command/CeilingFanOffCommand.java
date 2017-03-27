package maestro.headfirst.experiments2.command;

public class CeilingFanOffCommand implements Command {
	
	private CeilingFan ceilingFan;
    private int prevSpeed;

	
	
	
	public CeilingFanOffCommand( CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;

	}

	@Override
	public void execute() {
		prevSpeed = this.ceilingFan.getSpeed();
		this.ceilingFan.off();
		
	}

	/*
	 * To undo we set the speed of the fan back to 
	 * its previous speed.
	 */
	@Override
	public void undo() {
		
		switch( prevSpeed ){
		case CeilingFan.HIGH:
			this.ceilingFan.high();
			break;
		case CeilingFan.MEDIUM:
			this.ceilingFan.medium();
			break;
		case CeilingFan.LOW:
			this.ceilingFan.low();
			break;
		case CeilingFan.OFF:
			this.ceilingFan.off();
			break;
		default:
			this.ceilingFan.off();
			break;
		}
        
	}


}
