/* WAJ 
 1
 2 2
 3 3 3
 4 4 4 4
 */
package AssignmentModule3;

public class Pattern3Pro9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i, j;
	        int n = 5;
	        for (i = 1; i <= n; i++) {
	            for (j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            for (j = 1; j <= i; j++) {
	                System.out.print(i+ " ");
	            }
	            System.out.println();
			}
	}

}
