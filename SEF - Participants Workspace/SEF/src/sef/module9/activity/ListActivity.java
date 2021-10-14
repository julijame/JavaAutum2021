package sef.module9.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.
		List obj = new ArrayList();
		obj.add("a");
		obj.add("b");
		obj.add("c");

		//2 - Call print method to print the list passed as its parameter.
		ListActivity l = new ListActivity();
		l.print(obj);
	}
	
	void print(List obj)
	{
		//3 - Type code to print this list
		//Notice the order in which elements get printed.
		Iterator<String> it = obj.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
