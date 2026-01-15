package Assignment03;

import java.util.HashMap;
import java.util.Map;

public class Que3 {
	public static void main(String[] args) {
		// Demonstrating Constructors

		// 1. Default constructor
		HashMap<Integer, String> map1 = new HashMap<>();
		System.out.println("Constructor 1: Default -> " + map1);

		// 2. Constructor with initial capacity
		HashMap<Integer, String> map2 = new HashMap<>(20);
		System.out.println("Constructor 2: With capacity 20 -> " + map2);

		// 3. Constructor with initial capacity and load factor
		HashMap<Integer, String> map3 = new HashMap<>(10, 0.75f);
		System.out.println("Constructor 3: With capacity 10 and load factor 0.75 -> " + map3);

		// 4. Constructor with another Map
		Map<Integer, String> temp = new HashMap<>();
		temp.put(1, "A");
		temp.put(2, "B");
		HashMap<Integer, String> map4 = new HashMap<>(temp);
		System.out.println("Constructor 4: From another map -> " + map4);

		// Demonstrating Methods
		HashMap<Integer, String> hm = new HashMap<>();

		// 1. put(K,V)
		hm.put(1, "Apple");
		hm.put(2, "Banana");
		hm.put(3, "Cherry");
		System.out.println("1. put(): " + hm);

		// 2. putIfAbsent(K,V)
		hm.putIfAbsent(2, "Mango");
		hm.putIfAbsent(4, "Mango");
		System.out.println("2. putIfAbsent(): " + hm);

		// 3. get(Object key)
		System.out.println("3. get(2): " + hm.get(2));

		// 4. getOrDefault(Object key, V defaultValue)
		System.out.println("4. getOrDefault(10, \"Default\"): " + hm.getOrDefault(10, "Default"));

		// 5. remove(Object key)
		hm.remove(3);
		System.out.println("5. remove(key): " + hm);

		// 6. remove(Object key, Object value)
		hm.remove(4, "Mango");
		System.out.println("6. remove(key,value): " + hm);

		// 7. containsKey(Object key)
		System.out.println("7. containsKey(1): " + hm.containsKey(1));

		// 8. containsValue(Object value)
		System.out.println("8. containsValue(\"Banana\"): " + hm.containsValue("Banana"));

		// 9. size()
		System.out.println("9. size(): " + hm.size());

		// 10. isEmpty()
		System.out.println("10. isEmpty(): " + hm.isEmpty());

		// 11. keySet()
		System.out.println("11. keySet(): " + hm.keySet());

		// 12. values()
		System.out.println("12. values(): " + hm.values());

		// 13. entrySet()
		System.out.println("13. entrySet(): " + hm.entrySet());

		// 14. replace(K,V)
		hm.replace(2, "Orange");
		System.out.println("14. replace(key,value): " + hm);

		// 15. replace(K, oldValue, newValue)
		hm.replace(2, "Orange", "Guava");
		System.out.println("15. replace(key,old,new): " + hm);

		// Iteration using for-each
		System.out.println("\nIterating HashMap:");
		for (Map.Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
}
