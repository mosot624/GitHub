import java.util.Scanner;
import java.util.Random;

class Person {
	private String name;
	private int age;

	void speak() {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello ").append(name).append(" and your age is ").append(age);
		System.out.println(sb);
	}

	int calculationRetirement() {
		int yearsleft = 65 - age;

		return yearsleft;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public String getName() {
		return name;
	}

	void randomStuff(String randomA) {
		System.out.println(randomA);
	}

}

public class objectOrientedProgramming {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your name");
		String myLine = scan.nextLine();
		String fellersName = myLine;

		System.out.println("What is your age");
		int myLineB = scan.nextInt();
		int fellersAge = myLineB;

		Person person1 = new Person();
		person1.setName(fellersName);
		person1.setAge(fellersAge);
		person1.speak();

		person1.randomStuff("if this shows random works");

		int year = person1.calculationRetirement();
		System.out.println("You will retire in " + person1.calculationRetirement() + " years");
		System.out.println(person1.getName());
	}
}
