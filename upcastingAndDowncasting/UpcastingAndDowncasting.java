package upcastingAndDowncasting;
class MachineUpcasting{
	public void start(){
		System.out.println("Machine Started");
	}
}

class Camera extends MachineUpcasting{
	public void start(){
		System.out.println("Camera Started");
	}
	public void snap(){
		System.out.println("Photo taken");
	}
}


public class UpcastingAndDowncasting {

	public static void main(String[] args) {
		MachineUpcasting machine1= new MachineUpcasting();
		Camera camera1= new Camera();
		
		//Upcasting
		MachineUpcasting machine2 = camera1;
		machine2.start();
		
		//Downcasting
		MachineUpcasting machine3 = new Camera();
		Camera camera2 = (Camera)machine3;
		//even though it uses machine3 properties. Machine3 is under camera object.
		camera2.snap();
		
		//Doesn't work
		MachineUpcasting machine4 =new MachineUpcasting();
		//Camera camera3 = (Camera)machine4;
		//camera3.start();
		
	}

}
