/*
 * Student: Eduardo Aguirre
 * Session 2
 * Assignment 1
 * Java program that allows the user to input his/her age. Then the program validate 
 * whether the person is eligible to vote or not and displays the result to the user.
 */

//Import the Scanner Java Class that allows the User to Input answers such as the age 
import java.util.Scanner;


public class EligibleToVote {

	public static void main(String[] args) { //Main method to start the Program
	
		//Initiates the Scanner Object to allow User to enter Data
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		
		//Displays Welcome Message to the User
		System.out.println("===============================================");
	    System.out.println("Welcome to the Eligible for Voting App");
	    System.out.println("===============================================");
		
		//Prompts User to validate his/her Age
		System.out.print("Do you want to validate if you are eligible to vote: ");
		String choice=sc.next(); //Stores the response from User
		
		//As long as the user choice variable = Yes or Y executes the Code below
		while (choice.equalsIgnoreCase("Yes") || choice.equalsIgnoreCase("Y"))
				{
			       //Prompt User to enter his/her Age
			       System.out.print("Enter your Age: ");
			       int age = sc.nextInt(); //Stores the User's Age
			       
			       //Validates the User's Age
			       //If user's age is greater or equal to 18 then indicates user can vote
			       if (age>=18)
			       {
			    	   System.out.println("Congratulations, based on your Age: " +age +" years old " +"you can Vote !");
			    	   
			       }
			       else //If user's age is lower than 18 then indicates user cannot vote
			       {
			    	   System.out.println("! Sorry you cannot vote because your are under age!");
			    	   
			       }
			       //Ask user if the user wants to enter the Age again
			       System.out.print("Do you want to enter your age again? Y|N : ");
			       choice=sc.next(); //Stores user's age
			       System.out.println(); //Adds a blank space
			       
				}   
					
		            //Prints the message when the choice variable to "Do you want to validate if you are eligible to vote: or Do you want to enter your age again? Y|N is not Yes or Y
		            System.out.println("===============================================");
				    System.out.println("Thanks for using the Voting Eligibility App");
				    System.out.println("===============================================");           
	
	}


}
