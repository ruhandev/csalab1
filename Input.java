//(c) A+ Computer Science
//www.apluscompsci.com
//NAME - 
//DATE - 
//PURPOSE - 

import java.util.Scanner;

public class Input
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo, multBy, favNum;
		
		//add more variables of at least 2 different types


		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();


		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();
		
		System.out.print("Enter an integer to multiply by ::");
		multBy = keyboard.nextInt();
		
		System.out.print("Enter your favorite number ::");
		favNum = keyboard.nextInt();


		//add in input for all variables


		System.out.println();
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );
		System.out.println("multiplied num =" + intOne + (intTwo * multBy));
		System.out.println("favorite num =" + favNum);
		

		//add output for all variables
		
		


	}
}