package genericWildcard;
import java.util.ArrayList;



class Machine {

	@Override
	public String toString() {
		return "I am a machine";
	}
	
}

class Camera extends Machine {
	@Override
	public String toString() {
		return "I am a camera";
	}
}
public class GenericWildcard {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList<Machine>();
		list1.add(new Machine());
		list1.add(new Machine());
		
		ArrayList list2 = new ArrayList<Camera>();
		list2.add(new Camera());
		list2.add(new Camera());
		
		
		
		showList(list2);
	}
	public static void showList(ArrayList<?> list1){
		for(Object value: list1){
			System.out.println(value);
		}
	}
	
}
