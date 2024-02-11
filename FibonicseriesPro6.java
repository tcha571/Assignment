//WAP to print fibonicic series 0, 1, 1, 2, 3, 5, 8 ,13,21,34 next number is previous num of sum
package AssignmentModule3;

public class FibonicseriesPro6 {
public static void main(String[] args) {
	int i=0,n=1,a,count=7,j;
	System.out.println(i);
	System.out.println(n);
	for (a= 2; a < count; a++) {
		
		j=i+n;
		System.out.println(j);
		i=n;
		n=j;
	}
}
}
