/*
*  UCF COP3330 Fall 2021 Assignment 1 Solution
*  Copyright 2021 Victor Urena
*/

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int sum;
		int product;
		int difference;
		int quotient;
		
		System.out.print("What is the first number? ");
		num1 = input.nextInt();
		
		System.out.print("What is the second number? ");
		num2 = input.nextInt();
		
		sum	= num1 + num2;	//adds numbers
		product	= num1 * num2;	//multiplies
		difference = num1 - num2;	//minuses
		quotient = num1 / num2;	//divides
		
		System.out.printf("%s + %s = %s\n%s - %s = %s\n%s * %s = %s\n%s / %s = %s", num1, num2, sum, num1, num2, difference, num1, num2, product, num1, num2, quotient);
		
	}

}
