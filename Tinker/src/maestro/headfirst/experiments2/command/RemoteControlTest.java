package maestro.headfirst.experiments2.command;

/*
 * This is our client is Command Pattern-speak.
 */
public class RemoteControlTest {

	public static void main(String[] args) {
		
		/*
		 * The remote is our Invoker, it will be passed a command object
		 * that can be used to make requests.
		 */
		SimpleRemoteControl remote = new SimpleRemoteControl();

		
		/*
		 * Now we create a Light object
		 * this will be the Receiver of the request.
		 *
		 */
		Light light = new Light("Garage Light");
		
		/*
		 * Here create a command and pass the Receiver to it.
		 */
		LightOnCommand lightOn = new LightOnCommand( light );
		
		/*
		 * Here, pass the command Invoker
		 */
		remote.setCommand(lightOn);
		
		/*
		 * And then we simulate the button being pressed.
		 */
		remote.buttonWasPressed();
		
		/*
		 * Now onto GarageDoor......
		 */
		GarageDoor garageDoor = new GarageDoor("");
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand( garageDoor );
		
		remote.setCommand( garageDoorOpen );
		remote.buttonWasPressed();
	}

}
