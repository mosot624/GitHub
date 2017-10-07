package anonymousClasses;

class Machine {
	public void startMachine() {
		System.out.println("Starting machine");
	}
}

interface Plant {
	public void grow();
}

public class Anonymous {

	public static void main(String[] args) {
		Machine mach1 = new Machine() {
			@Override
			public void startMachine() {
				System.out.println("Starting Camera");
			}
		};
		mach1.startMachine();

		Plant plant1 = new Plant() {

			@Override
			public void grow() {
				System.out.println("Tree is growing");
			}

		};
		
		plant1.grow();
	}

}
