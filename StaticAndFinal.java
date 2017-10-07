class Things {
	private String name;
	private String description;
	private static String abcdef;
	private static int id = 1;

	public void setname(String name) {
		this.name = name;
	}

	public void setDesciption(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public static int showInfo() {
		return id++;
	}

}

public class StaticAndFinal {

	public static void main(String[] args) {

		Things person1 = new Things();
		person1.setname("Michael");
		person1.setDesciption("Just a random guy");
		System.out.println(person1.getName() + " " + person1.getDescription() + Things.showInfo());

		System.out.println(person1.getName() + " " + person1.getDescription() + Things.showInfo());

	}

}
