package coreJava.concepts;

import java.util.Scanner;

public class SwitchCaseStatement {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operator here: ");
		char fruit = sc.next().trim().charAt(0);
		System.out.println("Enter the two number here ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		switch (fruit) {
		case '+':
			System.out.println(num1 + num2);
			break;

		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;

		case '/':
			if (num2 != 0) {
				System.out.println(num1 / num2);

			}
			break;

		case '%':
			System.out.println(num1 % num2);
			break;
			
		default:
			System.out.println("Input is invalid");
			break;
		}

	}
}
