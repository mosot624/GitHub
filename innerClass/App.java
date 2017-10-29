package innerClass;

import innerClass.Robot.Brain;

public class App {

	public static void main(String[] args) {
		Robot rb1 = new Robot(3);
		rb1.start();
		
		Robot.Brain brain1 = rb1. new Brain();
		//brain1.think();
		
		Robot.Battery bat1= new Robot.Battery();
		//bat1.charge();
	}

}
