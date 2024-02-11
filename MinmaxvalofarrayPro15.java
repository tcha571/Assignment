/*
 * WAP to find the maximum and minimum value of an array.

 */
package AssignmentModule3;

public class MinmaxvalofarrayPro15 {

	
		public int max(int [] array) {
		      int max = 0;
		     
		      for(int i=0; i<array.length; i++ ) {
		         if(array[i]>max) {
		            max = array[i];
		         }
		      }
		      return max;
		   }
		   public int min(int [] array) {
		      int min = array[0];
		     
		      for(int i=0; i<array.length; i++ ) {
		         if(array[i]<min) {
		            min = array[i];
		         }
		      }
		      return min;
		   }
		   public static void main(String[] args) {
				// TODO Auto-generated method stub
		   int[] Arr = {23, 92, 56, 39, 93};
		   MinmaxvalofarrayPro15 m = new MinmaxvalofarrayPro15();
		      System.out.println("Max val in the array is::"+m.max(Arr));
		      System.out.println("Min val in the array is::"+m.min(Arr));
	
	
	}
	
	
	
	

}
