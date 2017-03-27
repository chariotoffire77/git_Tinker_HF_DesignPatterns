package maestro.headfirst.experiments2.command;

public class RemoteLoader2 {

	public static void main(String[] args) {
		
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        
        Light livingRoomLight = new Light("Living Room");
        TV    tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub("");
    	
        /*
         * Create all the Light Command objects.
         */
        LightOnCommand livingRoomLightOn = new LightOnCommand( livingRoomLight );
        LightOffCommand livingRoomLightOff = new LightOffCommand( livingRoomLight );
        
        
        /*
         * Create all the TV Command objects.
         */
        
        TVOnCommand tvOn = new TVOnCommand( tv );
        TVOffCommand tvOff = new TVOffCommand( tv );
        
     
        /*
         * Create the stereo On & Off commands
         */
        StereoOnWithCDCommand stereoOnWithCD =  new StereoOnWithCDCommand( stereo );
        StereoOffCommand stereoOff =  new StereoOffCommand( stereo );
        
        
        /*
         * Create all the Hottub Command objects.
         */
        
        HottubOnCommand hottubOn = new HottubOnCommand( hottub );
        HottubOffCommand hottubOff = new HottubOffCommand( hottub );
        
        /*
         * Next we create two arrays, one for the On commands
         * and one for the Off commands, and load them with the 
         * corresponding commands.
         */
        
        Command[] partyOn =  { livingRoomLightOn, stereoOnWithCD, tvOn, hottubOn };
        Command[] partyOff = { livingRoomLightOff, stereoOff, tvOff, hottubOff };
        
        MacroCommand partyOnMacro = new MacroCommand( partyOn );
        MacroCommand partyOffMacro = new MacroCommand( partyOff );
        
        /*
         * Now that we've got all our commands, in these two macros,
         *  we can load them into one ON slot and one OFF slot respectively.
         */
        remoteControl.setCommand(0,  partyOnMacro,   partyOffMacro);

        
        /*
         * Here's where we use our toString() method to print each remote
         * slot and the command that it is assigned to
         */
        
        System.out.println(remoteControl);
        
        System.out.println("--- Pushing Macro On ---");
        remoteControl.onButtonWasPushed(0);
        
        
        System.out.println("--- Pushing Macro Off ---");
        remoteControl.offButtonWasPushed(0);
        
        System.out.println("--- Undoing Pushing Macro Off ---");
        remoteControl.undoButtonWasPushed();
        
        remoteControl.undoButtonWasPushed();

        
        
	}

}
