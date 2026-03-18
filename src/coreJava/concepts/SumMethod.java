package coreJava.concepts;

//import java.util.Scanner;

// Using static  keyword
public class SumMethod {

	static String greet(String name) {
		String answer="Rashi Panchal ";
		System.out.println("Hello My Name is "+answer);
		return answer ;
	}

	static int sum(int num1,int num2) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number here ");
//		int num1 = sc.nextInt();
//		System.out.println("Enter the 2 number here ");
//		int num2 = sc.nextInt();
		int sum = num1 + num2;
		System.out.println("The sum is = " + sum);
		return sum;

	}

	static int subtract(int num1,int num2) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number here ");
//		int num1 = sc.nextInt();
//		System.out.println("Enter the 2 number here ");
//		int num2 = sc.nextInt();
		int subtract = num1 - num2;
		System.out.println("The subtraction of two number is = " + subtract);
		return subtract;
	}

	static int multiply(int num1,int num2) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number here ");
//		int num1 = sc.nextInt();
//		System.out.println("Enter the 2 number here ");
//		int num2 = sc.nextInt();
		int multiply = num1 * num2;
		System.out.println("The multiplication of two number is = " + multiply);
		return multiply;
	}
// I used parameter there
	static int divide(int num1,int num2) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the first num here");
//		int num1 = sc.nextInt();
//		System.out.println("Enter the second number here ");
//		int num2 = sc.nextInt();
//		if (num2 == 0) {
//			System.out.println("Th second number is zero! Try another number");

//		}
		int divide = num1 / num2;
		System.out.println("Input is " + divide);
		return divide;

	}

	public static void main(String[] args) {

		String ans =greet("Tushar");
		int add =sum(13,26);
		int subtract =subtract(19,14);
		int multiply=multiply(3,18);
		int division =divide(23,2);

		System.out.println(ans);
		System.out.println(add);
		System.out.println(subtract);
		System.out.println(multiply);
		System.out.println(division);
		
	}

}
