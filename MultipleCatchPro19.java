/*
 * WAP to demonstrate multiple catch blocks
 */
package AssignmentModule3;

public class MultipleCatchPro19 {

	public static void main(String[] args) {
		 try{    
             int a[]=new int[5];    
             
             System.out.println(a[10]);  
            }    
           
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
               }    
            catch(Exception e)  
               {  
                System.out.println(" Exception ");  
               }             
            System.out.println("rest of the code");    
	}

}
