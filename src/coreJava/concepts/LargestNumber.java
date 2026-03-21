package coreJava.concepts;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		//i used Scanner class from the java.util package to take 
		//the input from the user for integer input ,i used nextInt() method there
		//i store multiple value in variable a,b,c and d .Then i initalized a variable max 
		//with the first value and compared it with remaning values using if conditions if a 
		//larger value is found finally i print the largest number
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number here: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

//		int max = a;
//		if (b > max) {
//			max = b;
//
//		}
//		if (c > max) {
//			max = c;
//		}
//		if (d > max) {
//			max = d;
//		}
		
// So this is also work same as before because we use Math here
		int max = Math.max(d,Math.max(c,Math.max(a, b)));
		System.out.print(max + " is the Largest Number");
		
		

	}
}
