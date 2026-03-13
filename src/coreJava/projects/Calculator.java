package coreJava.projects;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);
        
		while (true) {
			System.out.println("Enter the operator here:");
			char op = sc.next().trim().charAt(0);
			if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
				System.out.println("Enter the two numbers here");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
                
				if (op == '+') {
					int ans = num1 + num2;
					System.out.println(ans);
				}
				if (op == '-') {
					int ans = num1 - num2;
					System.out.println(ans);
				}
				if (op == '*') {
					int ans = num1 * num2;
					System.out.println(ans);
				}
				if (op == '/') {
					if (num2 != 0) {
						int ans = num1 / num2;
						System.out.println(ans);
					}
				}
				if (op == '%') {
					int ans = num1 % num2;
					System.out.println(ans);
				}

				
			} else if (op == 'x' || op == 'X') {
				break;
			} else {
				System.out.println("Invalid!");
			}
			
		}

	}
}
