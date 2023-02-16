package Lab3_16_feb;
class demo1  //parent class
{
	int i=20;
	void showi() {    //method1
	System.out.println("value of i: "+i);  //printing the value of i
}}
class demo2 extends demo1  //child class 
{
	int j=10;
	void showj() {  //method 2
		System.out.println("value of j: "+j);  //printing the value of j
	}
}
class demo3 extends demo2  //child class for demo2
{
	int k=40;
void sum()  //method 3
{
	System.out.println("value of k: "+k);  //printing the value of k
	System.out.println("Sum of (i+j+k) is: "+(i+j+k));  //printing the sum
}}
public class MultilevelEg {  //main class
public static void main(String[] args) {  //main class method
	demo3 ob=new demo3();  //object of child class
	ob.showi();
	ob.showj();
	ob.sum();
	}
}
