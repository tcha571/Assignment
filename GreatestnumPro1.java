/*
 * W.A.J.P to Take three numbers from the user and print the greatest
number. 
 */
package AssignmentModule3;

import java.util.Scanner;

public class GreatestnumPro1 {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in)	;
System.out.println("Please enter any num for A::");
int a=sc.nextInt();
System.out.println("Please enter any num for B::");
int b=sc.nextInt();
System.out.println("Please enter any number for C::");
int c=sc.nextInt();

if(a>b && a>c)
{
	  sc.nextLine();
		System.out.println("A IS GREATER THAN B AND C");
}
  else if (b>c && b>a) {
	  sc.nextLine();
	  System.out.println("B IS GREATER THAN A AND C");
	
}
  else {
	  sc.nextLine();
	System.out.println("C IS GREATER THAN A AND B");
	sc.close();
}
}

}


