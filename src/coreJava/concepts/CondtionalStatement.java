package coreJava.concepts;

public class CondtionalStatement {

	public static void main(String[] args) {
		
		
		//if else -> we basically use it for check the condition 
		
		//if else statement
		int value=11;
		
		if(value==10) {
			
			System.out.print(true);
		}else
		{
			System.out.println(false);
		}

		//multiple if else conditional statement
		
		int salary = 24000;

		if (salary > 9000) {

			salary = salary + 1000;

		} else if (salary > 8000) {
			
			salary = salary + 2000;

		} else {
			salary = salary + 3000;
			
		}
		
		System.out.print(salary);
	}
}
