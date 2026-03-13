package coreJava.concepts;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number here : ");
	int reverse = sc.nextInt();
		
	int answer = 0;
	while(reverse>0)
	{
		int rem = reverse % 10;
		reverse /= 10;
		answer=answer*10+rem;
		
	}
	System.out.println(answer);
	}
}
