/*
 * WAP to iterate through all elements in an array list. 
 */
package AssignmentModule3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class IteratethroughelementPro22 {

	public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
 
        al.add(34);
        al.add(12);
        al.add(34);
        al.add(23);
        al.add(54);
 
        Enumeration<Integer> e = Collections.enumeration(al);
 
        while (e.hasMoreElements())
 
            System.out.println(e.nextElement());
	}

}
