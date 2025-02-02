package guvitask1;
//code for printing 10 to 50
import java.util.Scanner; //scanner package
public class printnum {      //my class is printnum
	public static void main(String[] args) {  //call to main method()
		Scanner rose = new Scanner(System.in);//creating a scanner object as rose
		System.out.println("Enter the Number:");
		int N = rose.nextInt();	//read integer from user for N variable
		for (int num=10 ; num<=N ;num++){  //for loop concept
			System.out.println(num);
		}
		
	}
}

