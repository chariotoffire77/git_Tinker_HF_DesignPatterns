package maestro.headfirst.experiments2.command;

public class GarageDoorDownCommand implements Command {
	
	GarageDoor garageDoor;
	
	GarageDoorDownCommand( GarageDoor garageDoor ){
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		this.garageDoor.down();

	}

	@Override
	public void undo() {
		this.garageDoor.up();
		
	}

}
