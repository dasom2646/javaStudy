package main.ch11;

import java.util.*;

class Ex11_05 {
	public static void main(String[] args) {
		Collection c = new HashSet(); // Set은 Collection의 자손
//	HashSet list = new HashSet(); // Set은 Collection의 자손
//	Collection c = new TreeSet();  
		c.add("1");
		c.add("2");
		c.add("3");
		c.add("4");
		c.add("5");

		Iterator it = c.iterator();

		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
//	for(int i =0; i<list.size(); i++) {
//		Object obj =list.get(i);
//		System.out.println(obj);
//	}
	}
}
