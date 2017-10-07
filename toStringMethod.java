class Animal{
	private int id;
	private String name;
	
	public Animal(int id, String name){
		this.id= id;
		this.name = name;
	}
	
	public String toString(){
		return String.format("%-4d:    %s", id, name);
		/*StringBuilder sb = new StringBuilder();
		sb.append(id).append(" ; ").append(name);
		return sb.toString(); */
	}
}


public class toStringMethod {

	public static void main(String[] args) {
		Animal frog = new Animal(123,"Michael");
		
		System.out.println(frog);
		
			
		
	}

}
