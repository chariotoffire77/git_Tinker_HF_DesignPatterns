package maestro.headfirst.experiments2.command;

public class RemoteLoader {

	public static void main(String[] args) {
		
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor ("");
        
        Stereo stereo = new Stereo("Living Room");
    	
        /*
         * Create all the Light Command objects.
         */
        LightOnCommand livingRoomLightOn = new LightOnCommand( livingRoomLight );
        LightOffCommand livingRoomLightOff = new LightOffCommand( livingRoomLight );
        
        LightOnCommand kitchenLightOn = new LightOnCommand( kitchenLight );
        LightOffCommand kitchenLightOff = new LightOffCommand( kitchenLight );
        
        /*
         * Create the On & Off for the ceiling fan.
         */
        
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand( ceilingFan );
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand( ceilingFan );
        
        /*
         * Create the Up & Down commands for the Garage.
         */
        
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand( garageDoor );
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand( garageDoor );
        
        /*
         * Create the stereo On & Off commands
         */
        StereoOnWithCDCommand stereoOnWithCD =  new StereoOnWithCDCommand( stereo );
        StereoOffCommand stereoOff =  new StereoOffCommand( stereo );
        
        /*
         * Now that we've got all our commands, we can load them into the remote slots
         */
        remoteControl.setCommand(0,  livingRoomLightOn,  livingRoomLightOff );
        remoteControl.setCommand(1,  kitchenLightOn,  kitchenLightOff );
        
        remoteControl.setCommand(2,  ceilingFanOn,  ceilingFanOff );
        remoteControl.setCommand(3,  stereoOnWithCD,  stereoOff );
        
        /*
         * Here's where we use our toString() method to print each remote
         * slot and the command that it is assigned to
         */
        
        System.out.println(remoteControl);
        
        /*
         * All right, we are ready to roll!
         * Now, we step through each slot and push its On & Off button.
         */
        
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        
        System.out.println(remoteControl);
        
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
                
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        
        
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        
        
        /*
         * Here we instantiate 3 commands: high, medium, and off
         * note off has been done above before.....
         */
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand( ceilingFan );
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand( ceilingFan );
        //CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand( ceilingFan );
        
        /*
         * Here we put medium in slot zero, and high in slot one.
         * We also load up the off commands.
         */
        remoteControl.setCommand(0,  ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1,  ceilingFanHigh, ceilingFanOff);
        
        /*
         * First, turn the fan on medium
         */
        remoteControl.onButtonWasPushed(0);
        
        /*
         * Then turn it off.
         */
        remoteControl.offButtonWasPushed(0);
        
        System.out.println(remoteControl);
        
        /*
         * Undo! It should go back to medium...
         */
        remoteControl.undoButtonWasPushed();
        
        
        /*
         * Turn it on to high this time.
         */
        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        /*
         * And, one more undo; it should go back to medium.
         */
        remoteControl.undoButtonWasPushed();
        
        
	}

}
