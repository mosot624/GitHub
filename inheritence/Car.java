package inheritence;

public class Car extends Machine {

	@Override
	public void start() {
		System.out.println("Start Car");
	}

	@Override
	public void off() {
		System.out.println("Car shutdown");
	}

	

}
