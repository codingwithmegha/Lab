package Lab4_23_feb;
class Manager{//main class
	int IncremenSalry() {//parent class method overloaded
		return 20000;
	}}
class Devloper extends Manager {
	int IncremenSalry() {//child class method overloaded  
		return 10000;
	}}
 class  Employee extends Manager {
	int IncremenSalry() {//child class method overloaded
		return 15000;
	}}
 public class Employee_Salary {//main class
	public static void main(String[] args) {//main method
		Manager m=new Manager();   //object
		System.out.println("Increment salay of manger : "+m.IncremenSalry());   //printing the incremented salary of manager
		
		Devloper d =new Devloper();
		System.out.println("Increment salay of Devloper : "+d.IncremenSalry());   //printing the incremented salary of developer
		
		Employee e =new Employee();
		System.out.println("Increment salay of employee : "+e.IncremenSalry());   //printing incremented salary of employee
	}}



