/*
 * Write a program to reverse an array of integer value
 */
package AssignmentModule3;

import java.util.Arrays;

public class ReverseanarrayofintvalPro26 {

	public static void main(String[] args) {
		 int[] a = {
		            10,4,78,40,30,89
		        };
		        
		        System.out.println("Original array : " + Arrays.toString(a));  
		        
		        for (int i = 0; i < a.length / 2; i++) {
		            int temp = a[i];
		            a[i] = a[a.length - i - 1];
		            a[a.length - i - 1] = temp;
		        }
		        
		        System.out.println("Reverse array : " + Arrays.toString(a));
	}

}
