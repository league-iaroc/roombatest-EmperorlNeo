package level4;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level4.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * complete the MAZE
	 * Hint: use bump sensors
	 */
	
	
	public void initialize() {
driveDirect(100,100);
sleep(6000);
driveDirect(0,100);
sleep(2600);
driveDirect(100,100);
sleep(100000);
driveDirect(100,0);
sleep(2600);
driveDirect(100,100);
sleep(12000);
driveDirect(0,100);
		
		
		
	}

	public void loop() {

	}
}
