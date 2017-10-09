package equallsMethod;

public class EquallsEQ {

	public static void main(String[] args) {
		Person person1 = new Person(12, "Jeff");
		Person person2 = new Person(9, "Beck");
		
		System.out.println(person1.equals(person2));
		// don't use == in a none primitive variable
		String str1 = "Hello";
		String str2 = "Helloasdfasdf".substring(0, 5);

		System.out.println(str1.equals(str2));
		
		System.out.println(person1.hashCode());
		
		System.out.println(person1.getName().hashCode());
	}

}

class Person {
	private int ID;
	private String name;

	public Person(int iD, String name) {
		
		ID = iD;
		this.name = name;
	}
	

	public int getID() {
		return ID;
	}



	public void setID(int iD) {
		ID = iD;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Person [ID=" + ID + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (ID != other.ID)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
