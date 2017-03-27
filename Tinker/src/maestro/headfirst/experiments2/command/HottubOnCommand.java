package maestro.headfirst.experiments2.command;

public class HottubOnCommand implements Command {
	
	private Hottub hottub;
	
	public HottubOnCommand( Hottub hottub){
		this.hottub = hottub;
	}

	@Override
	public void execute() {
		hottub.on();
		
	}

	@Override
	public void undo() {
		hottub.off();
		
	}

}
