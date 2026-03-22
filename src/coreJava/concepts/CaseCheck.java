package coreJava.concepts;

import java.util.Scanner;
public class CaseCheck {

	public static void main(String[] args) {
		//Alphabet check
		/* 
		 *   I wrote a program to check if a character is 
		 * upperCase or lowerCase. I used the Scanner class
		 *  to take input from the user and read the first 
		 *  character. Then I compared the character using if 
		 *  statements: if it is between 'a' and 'z', I printed
		 *   lowerCase; if it is between 'A' and 'Z', I printed 
		 *   upperCase; otherwise, I printed 'Not a letter'.  
		 *    */
		Scanner in = new Scanner(System.in);
		System.out.println("please enter alphabet here : ");
		char check = in.next().trim().charAt(0);
		
		//next () gives a word and trim will remove extra space and charAt()
		//which will show the on which alphabet
		//is written on which index number
		System.out.println(check);
		
		// it will check either alphabet is written in upperCase or lowerCase 
		if(check >='a' && check <= 'z') {
			System.out.println("Lowercase");
		}else {
			System.out.println("Uppercase");
		}
		
	}
}
