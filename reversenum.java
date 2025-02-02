package guvitask1;
//code for reverse the order of numbers
import java.util.Scanner;//Scanner package
public class reversenum {                         //my class is reversenum
	public static void main(String[] args) { // call for a main method()
		Scanner shash = new Scanner(System.in); // assign Scanner object as shash
		System.out.println("Enter the number :");
		int num = shash.nextInt(); // get the integer order from user to reverse
		int convert=0;   // assign a temporary integer datatype variable as convert  
		while(num!=0) {              //using while loop condition statement here
			convert = convert*10 + num % 10 ; 
			num = num / 10; 
		}
		System.out.print("The number is reversed as :"+convert);
	}

}
//in a line 11 convert =convert*10 + num % 10
//if the num is user given as 876 then by assign operater convert as 0
//line 11 will do the operation as convert = 0 * 10 + 876 % 10;
//now convert = 6;then num =num / 10; num = 876 / 10 = 87;
//now it will print line 14 where the convert value is 6 
//then looping will continuous till num = 0;