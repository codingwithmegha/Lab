package Lab3_16_feb;
class Arithmetic{  //super class
     int add(int a,int b)  //parameterized method
     {
        return a+b;
     }
     }
	class Adder extends Arithmetic{  //sub class
    public class Sum{      //main class
	    public static void main(String []args){  //main function
	        Adder a = new Adder();    // Create a object 
	        System.out.println("sum is: "+(a.add(6,7)));  //printing the calling the method
	     }
	}}

