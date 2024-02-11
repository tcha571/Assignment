/*
 *  W.A.J.P to check given number is Armstrong or not?

 */

package AssignmentModule3;

import java.util.Scanner;

public class ArmstrongPro5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter any num to check given num is Armstrong or no::");
		int num = scanner.nextInt();
		int rem, cube, sum = 0, no = num;
		while (num != 0) {
			rem = num % 10;
			cube = rem * rem * rem;
			sum = sum + cube;// 27+125+1
			num = num / 10;
		}
		if (no == sum) {
			scanner.nextLine();
			System.out.println("Armstrong No");
		} else {
			scanner.nextLine();
			System.out.println("NOT a Armstrong No");
		}
	}

}
//371