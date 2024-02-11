package AssignmentModule3;
/*Write a program to compute the first 100 prime numbers
 * 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
 */
public class Sumof100primePro11 {
	
	 public static boolean is_Prime(int n) {
	        for (int i = 3; i * i <= n; i += 2) {
	        	 if (n % i == 0) {
	                 return false;
	             }
	         }
	         return true;
	        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i = 1;
	     int j = 0;
	     int n = 0;
              while (j < 100) {
            n++;
            if (n % 2 != 0) {
                if (is_Prime(n)) {
                    i += n;
                }
            }
            j++;
        }

        System.out.println("Sum of prime numbers upto 100: " + i);
    }

   
	}


