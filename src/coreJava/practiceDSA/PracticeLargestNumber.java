package coreJava.practiceDSA;

import java.util.Scanner;

public class PracticeLargestNumber {

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number here : ");
		int a= input.nextInt();
		int b= input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();

		int max =a;
		if(b>max){
		max=b;
		}
		if(c>max){
		max=c;

		}
		if(d>max){
		max =d;

		}

		System.out.print(max+" is the Largest Number");
}
}