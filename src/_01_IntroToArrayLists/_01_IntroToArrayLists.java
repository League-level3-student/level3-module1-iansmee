package _01_IntroToArrayLists;

import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.Iterator;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
ArrayList<String> things = new ArrayList<String>();

		//2. Add five Strings to your list
		things.add("dog");
		things.add("cat");
		things.add("bark");
		things.add("thanos");
		things.add("gaming");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < things.size(); i++) {
			String e = things.get(i);
			System.out.println(e);
		}
		
		//4. Print all the Strings using a for-each loop
		for (String string : things) {
			System.out.println(string);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < things.size(); i++) {
			String p = things.get(i);
			if(i%2==0) {
				System.out.println(p);
			}
		}
		//6. Print all the Strings in reverse order.
		for (int i = things.size()-1; i >= 0; i--) {
		String m = things.get(i);
		System.out.println(m);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < things.size(); i++) {
			String n = things.get(i);
			if(n.contains("e")) {
				System.out.println(n);
			}
		}
		
	}
}
