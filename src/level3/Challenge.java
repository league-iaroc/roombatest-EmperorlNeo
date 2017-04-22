package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
	driveDirect(100,100);
	sleep(10000);
	driveDirect(0,100);
	sleep(2000);
	driveDirect(100,100);
	sleep(13000);
	driveDirect(100,0);
	sleep(2000);
	driveDirect(100,100);
	sleep(8800);
	driveDirect(0,100);
	sleep(2400);
	driveDirect(100,100);
	sleep(10000);
	driveDirect(100,0);
	sleep(2000);
	driveDirect(100,100);
	sleep(10000);
		
		
		
	}

	public void loop() {
	
	}
}
