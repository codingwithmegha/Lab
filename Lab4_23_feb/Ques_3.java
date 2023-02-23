package Lab4_23_feb;

class Sports{  //class 1
    String getName(){   
        return "Generic Sports";
    }
  
    void getNumberOfTeamMembers(){  //method of class 1
        System.out.println( "Each team has n players in " + getName() );
    }
}
class Soccer extends Sports{  //class 2 inherit class 1
    
    String getName(){
        return "Soccer Class";
    }
void getNumberOfTeamMembers () {
       System.out.println( "Each team has 11 players in " + getName() );
}
}
public class Ques_3{
    
    public static void main(String []args){
        Sports c1 = new Sports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
    }
}
