package Lab_8_23march;
public class Question_3 { //main class
	    public static void main(String[] args) {  //main method
	        try {
	            int add=addTwoPositive(-4,5);
	            System.out.println("sum is"+add);  //printing the addition
	        } 
	        catch (ArithmeticException e) {
	            System.out.println(e);
	        }
	    }
  public static int addTwoPositive(int a,int b) {  
	        if (a<0||b<0) {
	            throw new ArithmeticException("Non-positive integer sent");  //if condition is true print msg
	        }
	        return (a+b);  //return sum
	    }
	}

