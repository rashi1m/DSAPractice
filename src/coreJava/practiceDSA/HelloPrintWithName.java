package coreJava.practiceDSA;

import java.util.Scanner;
public class HelloPrintWithName {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name ");
		String name =sc.next();
		
		System.out.println("Hello "+name);
		
	}
}
