package coreJava.concepts;

import java.util.Scanner;

public class FibbonacciSeries {
	public static void main(String[] args) {

		/*
		 * I used Scanner class from java.util package to take the input 
		 * from user. I will enter the number here nextInt() method will read this number 
		 *I used variable n to store the input value i used variable first and second inside this  
		 *variables i store the 0 and 1 value I print first and second variable value 
		 * I used for loop there i used i variable to initialize value i took 2 if the value is i is less than n i  value will be increase 
		 *which we call increment i used next variable and inside the variable i add first and second variable value thwn i print 
		 *it inside the first variable is equal to second variable it means second variable value store in first variable value 
		 *inside the second variable i store the next variable value 
		 *we call it fibbonacci series
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number here: ");
		int n = sc.nextInt();
		int first = 0;
		int second = 1;

		System.out.print(first + " " + second + " ");

		for (int i = 2; i < n; i++) {
			int next = first + second;
			System.out.print(next + " ");
			first = second;
			second = next;

		}
	}
}
