/*
 * WAP to calculate the average value of array elements. 
 */
package AssignmentModule3;

public class AverageofarrayelementPro13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] no = new int[]{20, 8, 76};
	        
	        int sum = 0;
	        
	        for (int i = 0; i < no.length; i++) {
	            sum = sum + no[i];
	        }
	        
	        double average = sum / no.length;
	        System.out.println("Average value of the array elements is : " + average); 

	}

}
