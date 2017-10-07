package abstractClass;

public class Cars extends Machine {

	@Override
	public void start() {
		System.out.println("Machine Started");
	}

	@Override
	public void doStuff() {
		System.out.println("Cars doing stuff");
	}

	@Override
	public void shutdown() {
		System.out.println("Cars shutting Down");
		
	}

}
