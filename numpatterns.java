package guvitask1;
// print particular number patterns
import java.util.Scanner; //Scanner package
public class numpatterns {                      //my class is numpatterns 
public static void main(String[] args)    //calling main function method
{   
int i, j, min, k; //n is the number up to you want to print  and assign integer values as i,j,k
System.out.print("Enter the value of k: ");  
Scanner sc= new Scanner(System.in);  // taking scanner object as sc
k=sc.nextInt();     // getting k as input value as 5
for (i = 1; i <= k; i++)    // for loop for outer loop rows
{   
for (j = 1; j <= k; j++)   // for loop for columns
{   
min = i < j ? i : j;   // condition taken suitable for pattern
System.out.print(k - min + 1+ " "); 
}  
System.out.println("");
}
}
}

}
