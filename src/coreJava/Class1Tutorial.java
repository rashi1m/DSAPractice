package coreJava;

public class Class1Tutorial {

	public static void main(String[] args) {

		int value = 16;
		for(int v=2; v<value ;v++) {
			if (value % v == 0) {
				System.out.println("Number is not prime");
			   return;
			}
		}
		System.out.println("NUmber is prime");
	}
	
}


	
	
	

