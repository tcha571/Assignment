/*
 * W.A.J.P to check given number is Prime or not?
 */
package AssignmentModule3;

//2,3,5,7
import java.util.Scanner;

public class PrimenumPro4 {

public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Please enter any num to check num is prime ::");
int num = sc.nextInt();
int flag = 1;
//flag = sc.nextInt();
for(int k=2; k<num;k++)
{
	if(num%k==0)
	{
		flag=0;
	}
}     
if(flag==0)
{
	sc.nextLine();
	System.out.println("Its NOT a prime number");
}

else {

	sc.nextLine();
	System.out.println("Prime number");
	
}
	}

}
