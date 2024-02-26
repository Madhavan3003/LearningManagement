package collectionMethods;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetEx {
	HashSet<String> set = new HashSet<String>();
	
	public void element1() {
	
	set.add("Madhavan");
	set.add("Sudhan");
	set.add("Jessica");
	set.add("Jefrina");
	set.add("Madhavan");
	set.add(null);
	}
	
	public void element2() {
		Set<String> set1 = new HashSet<String>();
		set1.add("Anitha");
		set1.add("Asha");
		set1.add("Jefrina");
		
	
	set.addAll(set1);
	System.out.println(set);
	
	Iterator<String> i = set.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	}
	
	
	public static void main(String[] args) {
	HashsetEx obj = new HashsetEx();
	obj.element1();
	obj.element2();
	
	}

}
