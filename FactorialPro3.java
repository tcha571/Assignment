/*
 * W.A.J.P to find factorial for Given Number.
 */
package AssignmentModule3;

import java.util.Scanner;

public class FactorialPro3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Please enter any number to check if given number is factorial or not:: ");
int number= sc.nextInt();
int factorial = 1;
for(int i=1;i<=number;i++)
{
	factorial*=i;
}
System.out.println("Factorial for given num is:: "+factorial);

	}

}
