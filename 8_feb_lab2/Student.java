package Lab_2;
import java.util.Scanner; //to import the
public class Student { //main class
	int rollno;  //global variable declaration
	String name;
	String course;
	Student(){   //default constructor
	Scanner sc= new Scanner(System.in);
	System.out.print("enter the roll no.");
	rollno=sc.nextInt();
	System.out.print("enter the name");
	name=sc.next();
	System.out.print("enter the course");
	course=sc.next();
	}
	Student(int id,String Name,String Course){   //Parameterized constructor
	rollno=id;
	name=Name;
	course=Course;
	}
	void show() {//show the method
	System.out.println("Student_Id is:"+ rollno);	
	System.out.println("Name is:"+ name);
	System.out.println("Course is:"+course);
	}
	public static void main(String[] args) {//main method
	Student s1= new Student();//create object
	Student s2=new Student();//create object
	System.out.println("without parameter");//show the default constructor
	s1.show();
	System.out.println();
	System.out.println("with parameter");//show the parameter constructor
	s2.show();
	}
	}








