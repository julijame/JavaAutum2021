package sef.module9.activity;
//Needs to be completed

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapActivity {

		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name
			Map obj = new HashMap();
			obj.put("4","four");
			obj.put("2","two");
			obj.put("3","three");
			obj.put("oooh", "uuuuh");

		
			
			//2 - Call print method to print the map passed as its parameter.
			MapActivity m = new MapActivity();
			m.print(obj);
		}
		
		void print(Map obj)
		{
			//3 - Type code to print this map
			Set keySet = obj.keySet();
			Iterator it = keySet.iterator();
			while (it.hasNext()) {
				String key = (String)it.next();
				System.out.println(key+"\t"+obj.get(key));
			}
		}
	}
