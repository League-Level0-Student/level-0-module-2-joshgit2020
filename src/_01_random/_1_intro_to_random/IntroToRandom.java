//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._1_intro_to_random;

import java.util.Random;

public class IntroToRandom {
	public static void main(String[] args) {
		
		int number = 0;
		
		// Before you can make random numbers, you need a Random object. Random objects make random things.
		// Random objects are created like this.
		Random ran = new Random();
		
		/*************  Random integers with no bounds  *************/
		
		// Run this program and you will see that nextInt created 5 random integers which have been printed to the console
		for (int i=0; i<5; i++) {
			number = ran.nextInt();
			System.out.println(number);
		}
		// The range of numbers that an int variable can hold is very large (as you can see in the console).
		// Integers can also be positive or negative.

		/*************  Random positive integers with an upper limit only  *************/
		
		// Usually we want to limit the numbers to a range in our program. 		
		for (int i=0; i<5; i++) {
			// Uncomment the line of code below, but replace the _____ with a positive integer (e.g. 100) before running the program			

			// number = ran.nextInt(_____);
			System.out.println(number);
			
		}
		
		// All the numbers printed by this loop are less then the number you added - AND POSITIVE
		// This means, if you entered 100, all the numbers returned by nextInt are between 0 and 99 inclusive

		
		/*************  Random integers with an upper and lower limit  *************/
		
		// But what if you don't want the range to start at 0?  Let's say we want numbers between 25 and 75 inclusive.
		// In this case, 25 is the lowest value we want, and 75 is the highest value. See below how to do this:
		
		for (int i=0; i<5; i++) {
			// Uncomment the line of code below, and replace (_____)  with   (highest value - lowest value + 1)
			// For our example, this will be:  ( 75 - 25 + 1 )
			// Also replace <lowest value> with the start of the range.  For our example, this is 25.
			
			// number = ran.nextInt(_____) + <lowest value>;
			System.out.println(number);
			
		}
		// This time, all the values printed should be between 25 and 75.

		
		/*************  Random integers with an upper and lower (negative) limit  *************/
		
		// Using the above example, generate 5 random numbers between -222 and 88


	}
}
