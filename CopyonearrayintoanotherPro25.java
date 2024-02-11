/*
 * WAP to copy one array in to another...
 */
package AssignmentModule3;

public class CopyonearrayintoanotherPro25 {

	public static void main(String[] args) {
		int a[] = { 5, 5, 4}; 
		  
        int b[] = new int[a.length]; 
        b = a; 
        b[0]++; 
  
        System.out.println("Contents of a "); 
        for (int i = 0; i < a.length; i++) 
            System.out.print(a[i] + " "); 
  
        System.out.println("\n\nContents of b "); 
        for (int i = 0; i < b.length; i++) 
            System.out.print(b[i] + " "); 
	}
}
