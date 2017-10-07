package abstractClass;

public abstract class Machine {
	private int ID;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	public abstract void start();
	public abstract void doStuff();
	public abstract void shutdown();
	
	public void runStDoSh(){
		start();
		doStuff();
		shutdown();
	}
	
	
}
