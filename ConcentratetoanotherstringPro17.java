/*
 * Write a java program to concentrate one string to another string
 */
package AssignmentModule3;

public class ConcentratetoanotherstringPro17 {

	public static void main(String[] args) {
		 String str1 = "Today is ";
	        String str2 = "Beautiful Day";
	        
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2); 
	       
	        String str3 = str1.concat(str2);

	        System.out.println("The concatenated string: " + str3);
	}

}
