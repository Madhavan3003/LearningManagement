package collectionMethods;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class LinkedListEx {
	
	List<String>list = new LinkedList<String>();
	
	public void element() {
		
	list.add("Madhavan");
	list.add("Sudhan");
	list.add("Jessica");
	list.add("Jefrina");
	
	}
	public void element1() {
	List <String>list1 = new LinkedList<String>();
	list1.add("Aasha");
	list1.add("Anitha");
	list1.add("Monisha");
	
	System.out.println(list);
	list.addAll(list1);
	System.out.println(list);
	
	boolean c = list.contains("Jefrina");
	System.out.println(c);
	
	boolean ca = list.containsAll(list1);
	System.out.println(ca);
	
	boolean e =list.isEmpty();
	System.out.println(e);
	
	Iterator<String> i = list.iterator();
	while(i.hasNext()){
		System.out.println(i.next());
	}
	
	boolean r = list.remove("Aasha");
	System.out.println(r);
	
	}
	
	public static void main(String[] args) {
		LinkedListEx obj = new LinkedListEx();
		obj.element();
		obj.element1();
	}
}
