// program to create object in java, show demo using program.
package Lab_2;
class ObjectEg { //class 2
	   int id;  //Instance variable
	   String name;
	}
public class Object {
	public static void main(String args[]) {
		ObjectEg obj=new ObjectEg(); //create object
		obj.id=101;
		obj.name="Megha";
		System.out.println(obj.id+ " "+obj.name); // printing number with a white space
	}
}


