package guvitask1;
//code for print the smaller number among 3 numbers
import java.util.Scanner;                  //Scanner package
public class smallest {                   // my class is smaller
	public static void main(String[] args) { // call for main method()
		Scanner priya = new Scanner(System.in);  // creating Scanner object as priya
		System.out.println("Enter 3 numbers to compare :");
		int a = priya.nextInt(); // get integer a from user
		int b = priya.nextInt(); // get integer b from user
		int c = priya.nextInt(); // get integer c from user
		if((a<b) && (a<c)) {      // using if condition with combination of logical operator 
			System.out.print(a+" is the smaller number");//if both condition gets true print a smaller
		}else if((b<a) && (b<c)) {   //else if condition with a same logical operator && 
			System.out.print(b+" is the smaller number");// if both condition gets true then print b smaller 

		}else {                          // here the false part 
			System.out.print(c+" is the smaller number"); // it will print c smaller when all the conditions gets failed
		}
	
	}
}
