package coreJava.concepts;

import java.util.Scanner;

public class FibbonaciPractice {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number here :");
		int st= sc.nextInt();

		int first=0;
		int second=1;


		System.out.print(first+" "+second+" ");
		for(int i=2;i<st;i++){
		int next = first+second;
		System.out.print(next+" ");
		first= second ;
		second=next;

		}

		}
}
