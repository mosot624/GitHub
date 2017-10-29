package enumType;

public enum Animal {
	cat("Mongouse"), dog("Jefferson"), mouse("Jeff");
	
	private String name;

	Animal (String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public String toString(){
		return "Animal name: " + name;
	}

}
