package coreJava.concepts;

import java.util.Scanner;

// Using static  keyword
public class SumMetehod {
	
	 static void greet() {
		System.out.println("Hello Rashi");
	}
	 static int sum(){
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter the number here ");
		 int num1 = sc.nextInt();
		 System.out.println("Enter the 2 number here ");
		 int num2 = sc.nextInt();
		 int sum= num1+num2;
		 System.out.println("The sum is = "+sum);
		 return sum;
		 
	 }
	 static int subtract() {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter the number here ");
		 int num1 = sc.nextInt();
		 System.out.println("Enter the 2 number here ");
		 int num2 = sc.nextInt();
		 int subtract= num1-num2;
		 System.out.println("The sum is = "+subtract);
		 return subtract; 
	 }
	 static int multiply() {
	 Scanner sc =new Scanner(System.in);
	 System.out.println("Enter the number here ");
	 int num1 = sc.nextInt();
	 System.out.println("Enter the 2 number here ");
	 int num2 = sc.nextInt();
	 int multiply= num1*num2;
	 System.out.println("The sum is = "+multiply);
	 return multiply;
	 }
	 
	 static int divide() {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the first num here");
		 int num1=sc.nextInt();
		 System.out.println("Enter the second number here ");
		 int num2 = sc.nextInt();
		 if(num2 != 0) {
		 return num2;
		 }
		 int divide=num1/num2;
		 System.out.println("The total is "+divide);
		 return divide; 
		 
	 }
 public static void main(String[] args){
	 
	greet();
	sum();
	subtract();
	multiply();
	divide();
	
	
 }
	
}
