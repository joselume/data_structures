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
	private static DataStructures dataStructure = new Practice2();

	public static void main (String args []) {
		dataStructure.testHashMap();
		dataStructure.testHashSet();
		dataStructure.testStack();
		dataStructure.testQueue();
		dataStructure.testTreeMap();
	}
}
