package Lab_8_23march;
import java.util.Scanner;
public class Question_1 { //main class
      public void calculation() {  //method
      Scanner sc = new Scanner(System.in);  //for taking input from user
          int x=sc.nextInt();  //taking the value of x
          int y=sc.nextInt();   //taking the value of y
		try {
			int z=x/y;     //calculating the division
			System.out.println(z);  //printing the value of z
		}
		catch(Exception e) {
			System.out.println(e);  //printing the Exception
		}
      }
		public static void main(String[] args) {  //main method
			Question_1 ob=new Question_1();  //object
			ob.calculation();
		}
}