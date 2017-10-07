package generics;
import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// old array list method
		ArrayList list = new ArrayList();
		list.add("Potato");
		String fruit = (String)list.get(0);
		System.out.println(fruit);
		// modern method
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Michael");
		String name = list1.get(0);
		System.out.println(name);
		
	}

}
