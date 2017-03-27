package maestro.headfirst.experiments2.command;

public class CeilingFanHighCommand implements Command {
	
	private CeilingFan ceilingFan;
    private int prevSpeed;

	
	
	
	public CeilingFanHighCommand( CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;

	}

	@Override
	public void execute() {
		prevSpeed = this.ceilingFan.getSpeed();
		this.ceilingFan.high();
		
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
