package abstractClass;

public class Camera extends Machine{

	@Override
	public void start() {
		System.out.println("Camera Started");
	}

	@Override
	public void doStuff() {
		System.out.println("Camera doing stuff");
	}

	@Override
	public void shutdown() {
		System.out.println("Camera shutting Down");
		
	}
	
}
