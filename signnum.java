package guvitask1;
//code for find positive and negative numbers
import java.util.Scanner;//Scanner package 

public class signnum {  //my class is signnum
		public static void main(String[] args) {   //call the main method()
			Scanner yash = new Scanner(System.in); //create the Scanner object as yash
			System.out.println("Enter The Number :");
			int number = yash.nextInt();	//read a integer number value from user 
			if(number>0) {                 //if conditios part 
				System.out.println("Given Number is Positive"); //true part
			}else
			{
				System.out.println("Given number is Negative "); //false part
			}
		}

	}