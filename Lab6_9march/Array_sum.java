package Lab6_9march;
//A Java program to find all pairs of elements in an array whose sum is equal to a specified number
import java.util.Scanner;
public class Array_sum {   //main class	    
	public static void main(String args[]){  //main method
	Scanner sc =new Scanner(System.in);   //taking input from the user
	System.out.println("Enter the size of an array: ");
	int n= sc.nextInt();   //print the size of array
	int arr[]=new int[n];
	System.out.println("Enter the elements of the array: ");
	for(int i=0;i<n;i++)   {//print the element
	 arr[i]=sc.nextInt();
	}
	 System.out.println("Enter the number: ");
	 int num=sc.nextInt();  //the number you want to add
	System.out.println("indices of the elements whose sum is: "+num);
	for(int i=0;i<arr.length;i++){  
	for (int j=i;j<arr.length;j++){
	 if((arr[i]+arr[j])==num){   //addition of the number
	  System.out.println(arr[i]+"+"+arr[j]+"="+num);
	}
	 }
	}
	}
	}
