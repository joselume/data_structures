import java.util.*;

public class Practice2 implements DataStructures {

	@Override
	public void testHashMap() {
		Map<String, Integer> hash = new HashMap<>();
		hash.put("First_1", 1);
		hash.put("Second",  2);
		hash.put("Third",  3);
		hash.put("Four",  4);
		
		for (Map.Entry<String, Integer> entry : hash.entrySet()) {
			System.out.println("Entry key: "+entry.getKey() + " Entry value: " + entry.getValue());
		}
	}

	@Override
	public void testHashSet() {
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

	@Override
	public void testStack() {
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

	@Override
	public void testQueue() {
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

	@Override
	public void testTreeMap() {
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
}
