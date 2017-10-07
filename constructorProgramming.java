class machineCON {
	private String name;
	private int code;

	public machineCON() {
		this("arnie");
		System.out.println("Working0");
	}

	public machineCON(String name) {
		this(0);
		System.out.println("Working1");
		this.name = name;
	}

	public machineCON(int code) {
		this("aads", 123);
		System.out.println("Working2");
		this.code = code;
	}

	public machineCON(String name, int code) {
		System.out.println("Working3");
		this.code = code;
		this.name = name;
	}
}

public class constructorProgramming {

	public static void main(String[] args) {

		machineCON machine1 = new machineCON();

	}

}
