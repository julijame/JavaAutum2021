package sef.module9.activity;

//Needs to be completed
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetActivity {

	public static void main(String[] args) {
		//1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.
		Set<String> obj = new HashSet<String>();
		obj.add("Misha");
		obj.add("Tanja");
		obj.add("Vasja");
		obj.add("Vasja");

		
		//2 - Call print method to print the set passed as its parameter.

		SetActivity s = new SetActivity();
		s.print(obj);
	}
	
	void print(Set obj)
	{
		//3 - Type code to print this set
		//Notice the order in which elements get printed.
		Iterator<String> it = obj.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
