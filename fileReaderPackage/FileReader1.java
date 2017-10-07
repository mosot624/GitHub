package fileReaderPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {

	public static void main(String[] args) {
		File file1 = new File("TextFile.txt");
		BufferedReader br1 = null;
		try {
			FileReader fr1 = new FileReader(file1);
			br1 = new BufferedReader(fr1);
			String line1;
			while ((line1 = br1.readLine()) != null) {
				System.out.println(line1);

			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file1.toString());
		} catch (IOException e) {
			System.out.println("Cant read file : " + file1.toString());
		}
		finally{
			try {
				br1.close();
			} catch (IOException e) {
				System.out.println("Unable to close file" + file1.toString());
			} catch (NullPointerException ex){
				// File was never opened as br1's original value is null
			}
		}
		
		

	}

}
