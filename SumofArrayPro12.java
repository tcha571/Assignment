package AssignmentModule3;

public class SumofArrayPro12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] Array = {10, 50, 10, 20};
		    int sum = 0;
		    int i; 
		      
		    // Loop through array elements and get the sum
		    for (i = 0; i < Array.length; i++) {
		      sum += Array[i];
		    }
		    System.out.println("The sum of array element: " + sum);
	}

}
