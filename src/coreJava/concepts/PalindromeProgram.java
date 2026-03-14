package coreJava.concepts;

import java.util.Scanner;
public class PalindromeProgram {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number here ");
	int num= sc.nextInt();
	int original=num;
	int reverse =0;
	while(num >0) {
		
		int reminder = num % 10;
		num /= 10;
		 reverse = reverse *10 +reminder;
		
			
	
	}
	 System.out.println(reverse);
		
	if(original == reverse) {
		System.out.println("It is a plaindrome number ");
	}else {
		System.out.println("It is not a palindrome number");
	}
}
}
