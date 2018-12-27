package org.javabasics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoWhileTest {
	
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int i =0;
		int sumOfNumbers = 0;
		int average = 0;
		int j = 0;
		try{
		
		do{
			
			System.out.println("Enter numbers to find out the average: ");
			i = in.nextInt();
			
			sumOfNumbers++;

			j = j + i;
			
						
		}
		while(i != 'q');
		}
		catch (InputMismatchException e){
			System.out.println("The sum of numbers is: "+j);

		}
		
		average = average + i;
		
		
		
	}

}
