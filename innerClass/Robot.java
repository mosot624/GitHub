package innerClass;

public class Robot {
	private int id;
	
	class Brain{
		public void think(){
			System.out.println("Robot is " + id);
		}
	}
	static class Battery{
		public void charge(){
			System.out.println("Robot is charging");
		}
	}

	public Robot(int id) {
		this.id = id;
	}
	
	public void start(){
		System.out.println("Robot starting "+id);
		Brain brain1 = new Brain();
		brain1.think();
		final String name = "Michael";
		class Temp{
			public void doSomething(){
				System.out.println("ID is "+ id);
				System.out.println("My name is " + name);
			}
		}
		Temp temp1 = new Temp();
		temp1.doSomething();
	}
	
	
}
