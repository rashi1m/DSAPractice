package coreJava;

import java.util.Scanner;

public class Class1Tutorial {

	public static void main(String[] args) {

//		int value = 1;
//		for(int v=2; v<value ;v++) {
//			if (value % v == 0) {
//				System.out.println("Number is not prime");
//			   return;
//			}
//		}
//		System.out.println("Number is prime");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter your name here:");
		String name= sc.nextLine();
		System.out.println("Your name is " +name);
		
		System.out.println("Please enter your place");
		String place= sc.nextLine();
		System.out.println("Your place name is " +place);
		
		System.out.println("please enter your age here:");
		int age= sc.nextInt();
		
		System.out.println("Your age is " +age);
	}
	
}


	
	
	

