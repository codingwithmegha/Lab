// program to find the smallest number among three numbers.
package Lab_2;
import java.util.Scanner;
public class smallest_number {  //main class
	public static void main(String[] args) {  //main method
		Scanner sc=new Scanner(System.in); //creating a scanner class
		System.out.println("Enter a number1");
		int num1=sc.nextInt();
		System.out.println("Enter a number2");
		int num2=sc.nextInt();
		System.out.println("Enter a number3");
		int num3=sc.nextInt();
		findsmallest(num1,num2,num3); //create a method
		}
	public static void findsmallest(int num1,int num2,int num3) {
    if (num1<num2 && num1<num3) { //comparing by using AND operator
    		System.out.println("Number1 is smaller: "+num1);  //printing the value of "a" if true
    	}
    	else if(num2<num1 && num2<num3) ////comparing by using AND operator
    		{
    			System.out.println("Number2 is smaller: "+num2);  ////printing the value of "b" if true
    		}
    		else
    		{
    			System.out.println("Number3 is smaller: "+num3); ////printing the value of "c" if true
    		}
}

}