package com.qa.Exercises;

public class Runner {
	
	public static void main(String[] args) {
		
		// Calculator
		
		//calling a static method
		System.out.println(Calculator.addition(5, 3));
		
	
		System.out.println(Calculator.subtract(6, 3));
		
				
		System.out.println(Calculator.multiply(7, 5));
		

		System.out.println(Calculator.divide(8d, 3d));
		
		
		// Results
		
		Results.physics = 75;
		System.out.println("Physics: " + Results.physics);
		
		Results.chemistry = 120;
		System.out.println("Chemistry: " + Results.chemistry);
		
		Results.biology = 100;
		System.out.println("Biology: " + Results.biology);
		
		
		System.out.println("Total Mark: " + Results.totalMark());
		System.out.println("Overall Percentage: " + Results.percentage() + "%");
		
	
	}
	
	
}
