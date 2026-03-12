package coreJava;

import java.util.Scanner;
public class CaseCheck {

	public static void main(String[] args) {
		//Alphabet check
		Scanner in = new Scanner(System.in);
		System.out.println("please enter alphabet here : ");
		char check = in.next().trim().charAt(0);
		System.out.println(check);
		
		// it will check either alphabet is written in upperCase or lowerCase 
		if(check >='a' && check <= 'z') {
			System.out.println("Lowercase");
		}else {
			System.out.println("Uppercase");
		}
		
	}
}
