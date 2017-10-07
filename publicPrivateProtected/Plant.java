package publicPrivateProtected;

public class Plant {
	//bad practice
	public String name;
	
	//ok practice as long as final.
	public final static int ID =8;
	
	private String type;
	
	//protected variable can be accessed in the same package
	//even if its a extended class protected variable cannot be accessed.
	protected String size;
	
	int height;

	public Plant() {
		this.name = "Freddy";
		this.type = "Plant";
		this.size = "medium";
		this.height=10;
	}
	
	
}
