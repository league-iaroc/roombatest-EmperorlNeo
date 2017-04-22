package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		driveDirect(100,100);
		sleep(18000);
		driveDirect(0,100);
		sleep(3100);
		driveDirect(100,100);
		sleep(25000);
		driveDirect(100,0);
		sleep(3400);
		driveDirect(100,100);
		sleep(10000);
		
		
		
		
	}

	public void loop() {
	
	}
}
