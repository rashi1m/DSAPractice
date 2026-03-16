package coreJava.concepts;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the fruit name here");
		String statement = in.nextLine();

		switch (statement) {
		case "Mango":
			System.out.println("King of fruits ");
			break;
		case "Apple":
			System.out.println(" A sweet red fruit ");
			break;
		case "Banana":
			System.out.println("my favourite fruit ");
			break;
		case "Orange":
			System.out.println("Round fruit");
			break;
		default:
			System.out.println("Please enter a valid fruit name! ");
			break;
		}

	}
}
