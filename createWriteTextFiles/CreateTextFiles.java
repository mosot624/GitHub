package createWriteTextFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateTextFiles {

	public static void main(String[] args) {
		File file1 = new File("FileFile.txt");
		try (BufferedWriter br1 = new BufferedWriter(new FileWriter(file1))) {
			br1.write("hey");
			br1.newLine();
			br1.write("hello again");
			br1.newLine();
			br1.write("LastLine");

			
		} catch (IOException e) {
			System.out.println("Unable to read file" + file1.toString());
		}
	}
}
