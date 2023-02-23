package Lab4_23_feb;
class Bank{    //parent class
float getRateOfInterest() {    //parent class method overloaded
	return 0;
}
}
class SBI extends Bank{    //child class1
	float getRateOfInterest() {    //child class method overloaded
		return 8;
	}
}
class ICICI extends Bank{   //child class2
	float getRateOfInterest() {    //child class method overloaded
		return 7;
	}
}
class AXIS extends Bank{    //child class3
	float getRateOfInterest() {    //child class method overloaded
		return 9;
	}
}
public class Methodoverriding {   //main class
public static void main(String[] args) {   //main method
	Bank bank;   //object of parent class
	bank= new SBI();     //parent class object call child class
	System.out.println("SBI rate of interest:"+bank.getRateOfInterest());
	bank= new ICICI();    //parent class object call child class
	System.out.println("ICICI rate of interest:"+bank.getRateOfInterest());
	bank= new AXIS();    //parent class object call child class
	System.out.println("AXIS rate of interest:"+bank.getRateOfInterest());
}
}

