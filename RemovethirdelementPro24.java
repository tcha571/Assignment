/*
 *  WAP to remove the third element from a array list.
 */
package AssignmentModule3;

import java.util.ArrayList;
import java.util.List;

public class RemovethirdelementPro24 {

	public static void main(String[] args) {
		 List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("1st Element");
		  list_Strings.add("2nd Element");                                                         
		  list_Strings.add("3rd Element");
		  list_Strings.add("4th Element");
		  list_Strings.add("5th Element");
		  System.out.println(list_Strings);
		  list_Strings.remove(2);
		  System.out.println("Removed Third Element:\n"+list_Strings);
		 }
		
	}


