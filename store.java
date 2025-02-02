package guvitask1;
//code for discount in diwali purchase
import java.util.Scanner; // Scanner package
public class store {                               //my class is discount
		public static void main(String[] args) {  //calling main method()
			Scanner offer = new Scanner(System.in); // creating a scanner object as offer
			System.out.println("Enter your Name :");
			String name = offer.nextLine(); //getting customer name as a string using scanner object;
			System.out.println("Purchase Amount :");//nexLine()->take one line completely
			double amount = offer.nextDouble(); // input data type taken as double using scanner
			int dis = 0;                    // temporary variable as dis
			if((amount >=500)&&(amount <=1000)) { // using if condition with a logical &&and relational operator >=
				dis = 10;			//if true the customer get 10 % discount
			}else if(amount>1000)  //else if with condition 
			{
				dis = 20;   // if true then discount will be 20%
				
			}else {               // no discount for that customer
				System.out.println("No discount is applied");
				}
			double disamount = amount * dis/100.0; // calculation under discount
			double payableamount = amount - disamount; //  payable amount after discount
			System.out.println("Name :"+name);              //name
			System.out.println("Purchased Amount :"+amount); //purchased amount
			System.out.println("Final Payable Amount :"+payableamount); //payable amount 
			}
			}