package coreJava.concepts;

public class Overloading {
	static void add(int a,int b) {
		int sum = a+b;
		System.out.println("The total sum of two number is "+sum);
	}
	
	static void add(String ...s) {
		System.out.println("This is an String value");
	}
public static void main(String[] args) {
	
	//methods have same name but different parameters that is called overloading
	add("Kunal");
	add(3,4);
	
	
	
	
	
	
	
}
}
