package Lab3_16_feb;
class Teacher{ //parent class A
	String designation;   //variable declaration
    String college_Properties;
    String college_name;
	void work() {
	}
}
class IT_teacher extends Teacher {  //child class1
		void show() {
			System.out.println(designation="head of department");
		}
}
class Maths_teacher extends Teacher{ // child class 2
	void show1() {
		System.out.println(college_Properties="abcd");
	}
}
class soft_skill extends Teacher{
	void display() {
		System.out.println(college_name="V.M.L.G");
	}
}
public class Department {
public static void main(String[] args) {
	IT_teacher ob=new IT_teacher();
	ob.show();
	soft_skill ob1=new soft_skill();
	ob1.work();
	ob1.display();
	Maths_teacher ob2=new Maths_teacher();
	ob2.show1();
}
}
