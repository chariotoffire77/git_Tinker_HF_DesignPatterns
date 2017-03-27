package maestro.headfirst.experiments2.command;

public class LightOnCommand implements Command {
	
	private Light light;
	
	public LightOnCommand( Light light){
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
		
	}

	@Override
	public void undo() {
		light.off();
		
	}

}
