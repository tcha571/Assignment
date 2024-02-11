// Write a program to find second largest element in array
package AssignmentModule3;

import java.util.Arrays;
import java.util.Collections;

public class SecondlargestelementPro27 {
	 static void print2largest(Integer arr[], int arr_size)
	    {
	        
	        Arrays.sort(arr, Collections.reverseOrder());
	        for (int i = 1; i < arr_size; i++) {
	            if (arr[i] != arr[0]) {
	                System.out.printf("The second largest "
	                                      + "element is ::%d\n",
	                                  arr[i]);
	                return;
	            }
	        }
	 
	        System.out.printf("There is no second "
	                          + "largest element\n");
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
	        Integer arr[] = { 50, 60, 47, 25, 23 };
	        int n = arr.length;
	        print2largest(arr, n);
	    }
	}

}
