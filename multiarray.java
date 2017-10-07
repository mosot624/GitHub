
import java.util.Scanner;

import java.util.Random;

public class multiarray {

	public static void main(String[] args) {

		int[][] values = { { 1, 2, 3 }, { 4, 5, 6 }, };
		int value;

		value = values[0][1] + values[1][2];

		System.out.println(value);

		for (int i = 0; i < values.length; i++) {
			for (int k = 0; k < values[i].length; k++) {
				System.out.print(values[i][k] + "\t");
			}
			System.out.println();
		}
	}
}