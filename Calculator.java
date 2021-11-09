package com.qa.Exercises;
//Create a method that accepts two integers as input, 
//then returns an integer that is the sum of these two parameters. (Addition)
//
//Create the following additional three methods that each take two parameters:
//Multiplication - which takes two numbers and returns the product.
//Subtraction - which takes two numbers, then returns the result of the subtraction.
//Division - which takes two numbers, then returns the result of the division.


public class Calculator {
	
	public static int addition(int a, int b) {
		return a+b;
	}

	public static int subtract(int a, int b) {
	
		return a-b;
	}

	public static int multiply(int a, int b) {
	
		return a*b;
	}

	public static double divide(double a, double b) {
	
		return a/b;
	}

}
