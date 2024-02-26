package collectionMethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddAddall {
    List<Object> list = new ArrayList<>();

    public void elements() {
        list.add("jefrina");
        list.add("sarathi");
        list.add("magesh");
        list.add("suresh");
    }

    public void elements1() {
        List<Object> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);

        list.addAll(list2);
        boolean c = list.containsAll(list2); 
        System.out.println(c);
        boolean e=list.isEmpty();
        System.out.println(e);
        
       boolean r = list.remove("suresh");
       System.out.println(r);
       
       boolean ra =list.removeAll(list2);
       System.out.println(ra);
       
      boolean rea = list.retainAll(list);
      System.out.println(rea);
     int l= list.size();
     System.out.println(l);
     
     Object [] a = list.toArray();
     System.out.println(a);
        
        Iterator <Object> iterator = list.iterator();
        	while(iterator.hasNext()) {
 
        	System.out.println(iterator.next());
        }
    }
    
    public static void main(String[] args) {
        AddAddall obj = new AddAddall();
        obj.elements();
        obj.elements1();
        System.out.println(obj.list);
    }
}
