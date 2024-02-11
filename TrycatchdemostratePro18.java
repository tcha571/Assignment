/*
 * WAP to demostrate try and catch block
 */
package AssignmentModule3;

public class TrycatchdemostratePro18 {

	public static void main(String[] args) {
		 try {
		      int[] n= {1, 2, 3};
		      System.out.println(n[10]);
		    } catch (Exception e) {
		      System.out.println("Something went wrong.");
		    }
	}

}
