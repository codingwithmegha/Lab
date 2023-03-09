package Lab6_9march;
//Write a Java program to find common elements from three sorted (in non-decreasing order) arrays.
public class Common_element {   //main class
	public static void main(String[] args) {   //main method
	   int array1[]={2,4,8};    //Initialize array
	   int array2[]={2,3,4,8,10,16};     //Initialize array
	   int array3[]={4,8,14,40};    //Initialize array
		int x=0, y=0, z=0;
		System.out.println("common elements are");
		while(x<array1.length && y<array2.length && z<array3.length){
			if (array1[x]==array2[y] && array2[y]==array3[z]){
				System.out.print(array1[x]+" ");
				x++;
				y++;
				z++;
			}
			else if (array1[x]<array2[y])
				x++;
			else if (array2[y]<array3[z])
				y++;
			else
				z++;
		}
	}
}
