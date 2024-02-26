package collectionMethods;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {
	HashMap <String, Integer> map = new HashMap<>();
	
	public void element() {
		map.put("Madhavan", 60);
		map.put("Sudhan", 70);
		map.put("Jefrina", 20);
		map.put("Jessica", 30);
		
		int s =map.size();
		System.out.println(s);	
		
		boolean i = map.isEmpty();
		System.out.println(i);
		
		boolean c = map.containsKey("Madhavan");
		System.out.println(c);		
		
		boolean cv=map.containsValue(70);
		System.out.println(cv);
		
		int g = map.get("Jefrina");
		System.out.println(g);
		
		int r = map.remove("Madhavan");
		System.out.println(r);
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        for (Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
		}
	}
	
	public static void main(String [] args) {
		MapEx obj = new MapEx();
		obj.element();
		
		
	}
		
}
