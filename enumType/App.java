package enumType;

public class App {
	// public static final int dog = 0;
	// public static final int cat = 1;

	public static void main(String[] args) {
		
		Animal animal = Animal.cat;
		
		switch(animal){
		case dog:
			System.out.println("im a dog");
			break;
		case cat:
			System.out.println("im a cat");
			break;
		default:
			break;
		}
		
		System.out.println(Animal.dog);
		System.out.println("This animal's name is " + Animal.mouse.name());
		
		System.out.println(Animal.cat.getClass());
		System.out.println(Animal.cat instanceof Animal);
		System.out.println(Animal.mouse.getName());
		
		Animal animal2 = Animal.valueOf("cat");
		System.out.println(animal2);
	}

}
