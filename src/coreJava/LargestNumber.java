package coreJava;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
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
