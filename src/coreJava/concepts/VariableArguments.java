package coreJava.concepts;

import java.util.Arrays;

public class VariableArguments {
	//String ...v
	static void speak( String ...v) {
		System.out.println(Arrays.toString(v));
		
	}
public static void main(String[] args) {
	speak("kunal","rashi","Mahesh","Vinit");
//	System.out.println(answer);
	//internally its work in array- like values is inside the array
}
}
