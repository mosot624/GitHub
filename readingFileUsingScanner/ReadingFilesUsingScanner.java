package readingFileUsingScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFilesUsingScanner {

	public static void main(String[] args) throws FileNotFoundException {
		// or / this slash instead
		String fileName = "C:\\Users\\Michael\\Desktop\\Password.txt";

		File textFile = new File(fileName);

		Scanner in1 = new Scanner(textFile);
		int count = 1;

		while (in1.hasNextLine()) {
			String line = in1.nextLine();
			System.out.println(line);
			count++;
		}

		in1.close();
	}

}
