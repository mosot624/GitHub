package fizzbuzz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) throws InputMismatchException,Exception  {
		int i =0;
		while(i==0){
			try{
			Scanner in = new Scanner(System.in);
			long num = in.nextLong();;
			if(num % 3 ==0 && num % 4 == 0){
				System.out.println("FizzBuzz");

			}
			else if(num % 3 ==0){
				System.out.println("Fizz");

			}
			else if(num % 4 ==0){
				System.out.println("Buzz");

			}
			else{
				System.out.println(num);

			}
			}catch(InputMismatchException e){
				System.out.println("Please input an interger");
			}
		}
	}

}
