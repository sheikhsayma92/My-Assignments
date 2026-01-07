package Assignment03;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		// Demonstrating Constructors

		// 1. Default constructor (natural ordering)
		TreeMap<Integer, String> tm1 = new TreeMap<>();
		System.out.println("Constructor 1: Default -> " + tm1);

		// 2. Constructor with Comparator
		TreeMap<Integer, String> tm2 = new TreeMap<>(Comparator.reverseOrder());
		tm2.put(1, "A");
		tm2.put(2, "B");
		tm2.put(3, "C");
		System.out.println("Constructor 2: With Comparator (reverse order) -> " + tm2);

		// 3. Constructor with another Map
		Map<Integer, String> temp = new HashMap<>();
		temp.put(10, "X");
		temp.put(20, "Y");
		TreeMap<Integer, String> tm3 = new TreeMap<>(temp);
		System.out.println("Constructor 3: From another Map -> " + tm3);

		// 4. Constructor with SortedMap
		SortedMap<Integer, String> sm = new TreeMap<>();
		sm.put(100, "P");
		sm.put(200, "Q");
		TreeMap<Integer, String> tm4 = new TreeMap<>(sm);
		System.out.println("Constructor 4: From SortedMap -> " + tm4);

		// Demonstrating Methods
		TreeMap<Integer, String> tm = new TreeMap<>();

		// 1. put(K,V)
		tm.put(1, "Apple");
		tm.put(2, "Banana");
		tm.put(3, "Cherry");
		System.out.println("1. put(): " + tm);

		// 2. putIfAbsent(K,V)
		tm.putIfAbsent(2, "Mango");
		tm.putIfAbsent(4, "Mango");
		System.out.println("2. putIfAbsent(): " + tm);

		// 3. get(Object key)
		System.out.println("3. get(2): " + tm.get(2));

		// 4. remove(Object key)
		tm.remove(3);
		System.out.println("4. remove(key): " + tm);

		// 5. containsKey(Object key)
		System.out.println("5. containsKey(1): " + tm.containsKey(1));

		// 6. containsValue(Object value)
		System.out.println("6. containsValue(\"Banana\"): " + tm.containsValue("Banana"));

		// 7. size()
		System.out.println("7. size(): " + tm.size());

		// 8. isEmpty()
		System.out.println("8. isEmpty(): " + tm.isEmpty());

		// 9. keySet()
		System.out.println("9. keySet(): " + tm.keySet());

		// 10. values()
		System.out.println("10. values(): " + tm.values());

		// 11. entrySet()
		System.out.println("11. entrySet(): " + tm.entrySet());

		// 12. firstKey()
		System.out.println("12. firstKey(): " + tm.firstKey());

		// 13. lastKey()
		System.out.println("13. lastKey(): " + tm.lastKey());

		// 14. higherKey(K)
		System.out.println("14. higherKey(1): " + tm.higherKey(1));

		// 15. lowerKey(K)
		System.out.println("15. lowerKey(4): " + tm.lowerKey(4));

		// Iteration using for-each
		System.out.println("\nIterating TreeMap:");
		for (Map.Entry<Integer, String> entry : tm.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
}