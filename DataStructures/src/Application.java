import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

public class Application {
	
	private static void testHashMap() {
		System.out.println("testHashMap");
		Map<String, Integer> ocurrences = new HashMap<>();
		
		ocurrences.put("Jose", 10);
		ocurrences.put("Jennifer", 5);
		ocurrences.put("Valentina", 3);
		
		for(Map.Entry<String, Integer> e : ocurrences.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
	
	private static void testHashSet() {
		System.out.println();
		System.out.println("testHashSet");
		Set<String> countries = new HashSet<>();
		
		countries.add("Colombia");
		countries.add("Colombia");
		countries.add("Peru");
		countries.add("Peru");
		countries.add("Ecuador");
		countries.add("Ecuador");
		
		Iterator<String> iterator = countries.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	private static void testStack() {
		System.out.println();
		System.out.println("TestStack");
		Stack<String> stack = new Stack<>();
		
		stack.push("First");
		stack.push("Second");
		stack.push("Third");
		
		while(stack.size() > 0) {
			System.out.println(stack.pop());
		}
	}
	
	private static void testQueue () {
		System.out.println();
		System.out.println("testQueue");
		
		Queue<String> queue = new PriorityQueue<>();
		
		queue.add("First");
		queue.add("Second");
		queue.add("Third");
		
		while(queue.size()> 0) {
			System.out.println(queue.poll());
		}
	}
	
	private static void testTreeMap() {
		System.out.println();
		System.out.println("testTreeMap");
		
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(7, "Seven");
		treeMap.put(4, "Four");
		treeMap.put(8, "Eight");
		treeMap.put(1, "One");
		
		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue() );
		}
		
	}
	
	public static void main (String args []) {
		testHashMap();
		testHashSet();
		testStack();
		testQueue();	
		testTreeMap();
	}

}
