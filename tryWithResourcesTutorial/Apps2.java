package tryWithResourcesTutorial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Apps2 {

	public static void main(String[] args) {
		File file1 = new File("TextFile.txt");
		try (BufferedReader br1 = new BufferedReader(new FileReader(file1))){
			String line1;
			while ((line1 = br1.readLine()) != null) {
				System.out.println(line1);

			}
		} catch (FileNotFoundException e) {
			System.out.println("Can't find file" + file1.toString());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Unable to read file" + file1.toString());
		}
	}

}
