
public class StringBuilderAndStringFormat {

	public static void main(String[] args) {
		//Efficient way of strong string data.
		StringBuilder sb = new StringBuilder();
		sb.append("My name is ")
		.append("Michael. ")
		.append("And I am learning how to program.");
		
		System.out.println(sb.toString());
		// \n adds a new line
		
		//for integer
		System.out.printf("This is how much you ordedred %d\n", 5);
		//You can add space between characters by typing down a number in between % and d 
		//E.g
		System.out.printf("This %3d an example", 15);
		System.out.printf("This is how much it costed £ %.2f\n", 3.14);
		
	}

}
