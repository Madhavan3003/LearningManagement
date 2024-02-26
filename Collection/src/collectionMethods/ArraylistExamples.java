package collectionMethods;

import java.util.ArrayList;

public class ArraylistExamples {
public static void main(String[] args) {
	ArrayList<Integer>list=new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	System.out.println(list);
	ArrayList<Integer>list2=new ArrayList<Integer>();
	list2.add(5);
	list2.add(6);
	list2.add(7);
	list2.add(8);
	list2.addAll(list);
	System.out.println(list2);
	list.clear();
	System.out.println(list);
	list2.remove(6);
	System.out.println(list2);
}
}
