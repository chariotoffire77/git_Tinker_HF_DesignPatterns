package maestro.headfirst.experiments2.command;

public class RemoteControlWithUndo {
	
	/*
	 * This time around the remote is going to handle seven On and Off commands,
	 * which we will hold in corresponding arrays.
	 */
	
	private Command[] onCommands;
	private Command[] offCommands;
	
	/*
	 * THis is where we'll stash the last command executed
	 * for the undo button.
	 */
	private Command   undoCommand;
	
	/*
	 * In the constructor all we need to do is instantiate and
	 * initialize the on and off arrays.
	 */
	
	public RemoteControlWithUndo( ){
		onCommands =  new Command[7];
		offCommands = new Command[7];
		
		NoCommand noCommand = new NoCommand();
		
		for (int i=0; i<7; i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
			
		}
		
		undoCommand = noCommand;
	}
	
	/*
	 * The setCommand() method takes a slot position and an On & Off
	 * command to be stored in that slot. It puts these commands in the
	 * on and off arrays for later use
	 */
	public void setCommand( int slot, Command onCommand, Command offCommand){
		onCommands[ slot ] = onCommand;
		offCommands[ slot ] = offCommand;
	}
	
	/*
	 * When an On or Off button is pressed, the hardware takes care of calling
	 * the corresponding methods onButtonWasPushed or offButtonWasPushed.

	 */
	
	public void onButtonWasPushed( int slot ){
		onCommands[ slot ].execute();
		undoCommand = onCommands[ slot ];
	}
	
	public void offButtonWasPushed( int slot ){
		offCommands[ slot ].execute();
		undoCommand = offCommands[ slot ];
	}
	
	
	/* 
	 * 
	 * When the undo button is pressed, we invoke the undo() method
	 * of the command stored in the undoCommand.
	 * This reverses the operation of the last command executed.
	 * 
	 */
	public void undoButtonWasPushed(){
		undoCommand.undo();
	}
	
	/*
	 * We have overwritten toString() to print  out each
	 * slot and its corresponding command.
	 * You'll see us use this when we  test the remote control.
	 * 
	 */
	
	public String toString(){
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control ------\n");
		for (int i=0; i<onCommands.length; i++){
			stringBuff.append("[slot "+i+"] "+ onCommands[i].getClass().getName()+
					"      "+offCommands[i].getClass().getName()+"\n");
		}
		return stringBuff.toString();
	}

}
