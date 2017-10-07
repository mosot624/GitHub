package handlingMultipleException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;


public class Multiple {
	public void run() throws IOException, ParseException{
		//throw new IOException();
		
		throw new ParseException("problem here", 2);
	}
	
	public void input() throws IOException, FileNotFoundException{
		
	}
	
	public static void main(String[] args) {
		Multiple mul1 = new Multiple();
		/*
		try {
			mul1.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("Cant find parse exception");
		}
		*/
		/*
		try {
			mul1.run();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		try {
			mul1.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//FileNotFoundexception is a child class, so it comes 1st, before IOException which is a parent class
		try {
			mul1.input();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

