package maestro.headfirst.experiments2.command;

public class StereoOffCommand implements Command {
	
	private Stereo stereo;
	
	/*
	 * Just like the LightOnCommand, we get passed the instance
	 * of the stereo we are going to be controlling and we store it
	 * in a local instance variable.
	 */
	
	public StereoOffCommand( Stereo stereo){
		this.stereo = stereo;
	}

	
	/*
	 * To carry out this request, we need to call three methods on
	 * the stereo first, turn it on, then set it to play the CD,
	 * and finally set the volume to 11.
	 * Why 11? Well, it's better than 10, right
	 */
	@Override
	public void execute() {
		stereo.off();
		
	}
	
	public void undo() {
		stereo.on();
		
	}

}
