package maestro.headfirst.experiments2.facade;

public class HomeTheaterTestDrive {

	public static void main(String[] args) {
		// instantiate components here
		
		Amplifier amp  = new Amplifier("Top-O-Line Amplifier");;
		
		Tuner tuner= new Tuner("Top-O-Line AM/FM Tuner", amp);
		DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
		CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
		Projector projector = new Projector("Top-O-Line Projector", dvd);
		Screen screen = new Screen("Theater Screen");
		TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
		PopcornPopper popper = new PopcornPopper("Popcorn Popper");
		
		
		HomeTheaterFacade homeTheater = 
				new HomeTheaterFacade(amp, tuner, dvd, cd,
						projector, screen, lights, popper);
		
		homeTheater.watchMovie("Raiders of the Lost Ark");
		homeTheater.endMovie();
		
		

	}

}
