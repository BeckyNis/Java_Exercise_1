package com.qa.Exercises;

//A person takes 3 exams in college, Physics, Chemistry, and Biology, each exam has a maximum of 150 marks.
//When all the exam marks have been added together, we can find the overall percentage that the person has 
//got by multiplying their score by 100 and then dividing by 450.
//
//Create the results class, this class has 5 variables, Physics, Chemistry, and Biology, 
//total and percentage. This class should also have 2 methods:
//Method 1 - displays the results that the person got for each exam and then the total mark. 
//Method 2 - which finds and displays the percentage that the person received for the exams overall.

public class Results {
	
	static int physics;
	static int chemistry;
	static int biology;
	
	
	public static int totalMark() {
		int total = physics + chemistry + biology;
		return total;
	}
	
	public static double percentage() {
		double percent = (totalMark()*100)/450;
		return percent;
		
	}
	
	

}
