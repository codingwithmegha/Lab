package Lab6_9march;
//WAP to print the elements of the array which are present in odd positions.
public class Odd_Position {  //main class
	public static void main(String[] args) {   //main method   
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9};    //Initialize array   
           System.out.println("Elements of array present in odd position: ");  
           for(int i=0; i<arr.length; i=i+2) {   //Loop for the array incrementing value of i by 2  
            System.out.println(arr[i]);     //printing the number which is in odd position
        }    
    }  
}
