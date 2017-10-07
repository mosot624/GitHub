package polymorphism;

public class App {
	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree1 = new Tree();
		
		Plant plant2 = tree1;
		
		tree1.grow();
		tree1.shedLeaves();
		
		doGrow(plant1);
	}
	
	public static void doGrow(Plant plant){
		plant.grow();
	}
	
}
