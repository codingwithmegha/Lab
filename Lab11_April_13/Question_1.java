package Lab11_April_13;
import java.util.ArrayList;
	public class Question_1{ //main class
		     ArrayList<Integer> A1;
		     ArrayList<Integer> A2;
		    ArrayList<Integer> storeOddNumbers(int N) {
		        A1 = new ArrayList<>();
		        for(int i = 2; i <= N; i += 2) {
		            A1.add(i);
		        }
		        return A1;
		    }
		     ArrayList<Integer> printOddNumbers() {
		        A2 = new ArrayList<>();
		        for(int i = 0; i < A1.size(); i++) {
		            int num=A1.get(i)*5;
		            A2.add(num);
		            System.out.print(num);
		            if(i < A1.size()-1) {
		                System.out.print(",");
		            }
		        }
		        System.out.println();
		        return A2;
		    }
		    
		     int  retrieveOddNumber(int N) {
		        if(A1.contains(N)) {
		            return N;
		        }
		        return 0;
		    }
		     public static void main(String[] args) {
		            Question_1 ob = new Question_1();   // Create an instance of the OddNumbers class
		            ArrayList<Integer> A1 = ob.storeOddNumbers(10);  // Test the storeOddNumbers() method
		            System.out.println("A1: " + A1);
		            ArrayList<Integer> A2 = ob.printOddNumbers();  // Test the printOddNumbers() method
		            System.out.println("A2: " + A2);
		            int num1 = ob.retrieveOddNumber(4);  // Test the retrieveOddNumber() method
		            System.out.println("Number found: " +num1);
		            int num2 = ob.retrieveOddNumber(5);
		            System.out.println("Number found: " +num2);
		        }
		    }
	}

