import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Practice2 {
	
	public static void testHashMap() {
		Map<String, Integer> hash = new HashMap<>();
		hash.put("First_1", 1);
		hash.put("Second",  2);
		hash.put("Third",  3);
		hash.put("Four",  4);
		
		for (Map.Entry<String, Integer> entry : hash.entrySet()) {
			System.out.println("Entry key: "+entry.getKey() + " Entry value: " + entry.getValue());
		}
	}
	
	public static void testSet() {
		Set<String> set = new HashSet<>();
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("Four");
		
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next()); ;
		}
	}
	
	public static void main (String [] args) {
		testHashMap();
		testSet();
	}

}
