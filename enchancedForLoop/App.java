package enchancedForLoop;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Integer> array1 = new ArrayList<Integer>();
		int counter =0;
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			array1.add(i);
			counter++;
		}
		counter =1;
		for(int x: array1){
			sum += x;
			System.out.printf("%d.) %d %n",counter,sum);
			counter++;
		}
	}

}
