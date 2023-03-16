package Lab7_16march;
//Write a java program to reverse every word in string.
public class String_reverse {
public static void main(String[] args) {
	 String s1 = "Welcome to java";
	 System.out.println("Original String: "+s1);  //printing original string
     String word[]=s1.split(" ");
     String revString=" ";
     for(String w:word) {
    	 StringBuilder sb=new StringBuilder(w);
    	 sb.reverse();
    	 revString=revString+sb.toString()+" ";
     }
     System.out.println("Reverse String is :"+revString.trim());
     }
}
