package maestro.headfirst.experiments2.command;

public class GarageDoorUpCommand implements Command {
	
	GarageDoor garageDoor;
	
	GarageDoorUpCommand( GarageDoor garageDoor ){
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		this.garageDoor.up();

	}

	@Override
	public void undo() {
		this.garageDoor.down();
		
	}

}
