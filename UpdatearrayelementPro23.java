/*
 *  WAP to update specific array element by given element.

 */
package AssignmentModule3;

import java.util.ArrayList;
import java.util.List;

public class UpdatearrayelementPro23 {

	public static void main(String[] args) {
		List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("A");
		  list_Strings.add("B");
		  list_Strings.add("C");
		  list_Strings.add("D");
		  list_Strings.add("E");
		  System.out.println(list_Strings);
		  list_Strings.set(2, "Y");
		  System.out.println(list_Strings);

	}

}
