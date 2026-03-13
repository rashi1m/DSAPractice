package coreJava.concepts;

import java.util.Scanner;

public class Loops {
  public static void main(String[] args) {
	  /*
	   * syntax for loops
	   * 
	   * for(initialization ; condition ;increment/decrement)
	   * {
	   *    // body
	   * }
	   * 
	   */
 
  Scanner sc= new Scanner(System.in);
  System.out.println("Please enter the number here :  ");
  int input = sc.nextInt();
  for(int num=1;num < input ; num++) {
	  System.out.print(num +" ");
  }
  
  
  
  
  
  
  }
  
  
  
  
}
