package Lab_8_23march;
//Take two numbers x and y.Throw the exception if the two numbers are negative else print the Product of x and y.
import java.util.Scanner;
public class Question_2 {  //main class
	public void calculation() throws Exception {  //user define method
		Scanner sc = new Scanner(System.in);   //taking input from user
        int x=sc.nextInt();  //taking the value of x
        int y=sc.nextInt();   //taking the value of y
        	if(x<0 && y<0)
        	{
        		throw new Exception("Throw exception"); //if x and y is negative than throw exception will be print
        	}
        	else if(x==0 && y==0) {
        		throw new Exception("x and y should not be zero");
        	}
        	else {
        		System.out.println(x*y);  //it will print the product of x*y 
        	}
        }
	public static void main(String[] args)throws Exception {  //main method
		Question_2 ob=new Question_2();  //object
		ob.calculation();
	}
     }

