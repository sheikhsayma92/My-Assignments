package Assignment03;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Que4 {
	public static void main(String[] args) {
		// Demonstrating Constructors

		// 1. Default constructor
		Hashtable<Integer, String> ht1 = new Hashtable<>();
		System.out.println("Constructor 1: Default -> " + ht1);

		// 2. Constructor with initial capacity
		Hashtable<Integer, String> ht2 = new Hashtable<>(20);
		System.out.println("Constructor 2: With capacity 20 -> " + ht2);

		// 3. Constructor with initial capacity and load factor
		Hashtable<Integer, String> ht3 = new Hashtable<>(10, 0.75f);
		System.out.println("Constructor 3: With capacity 10 and load factor 0.75 -> " + ht3);

		// 4. Constructor with another Map
		Map<Integer, String> temp = new HashMap<>();
		temp.put(1, "A");
		temp.put(2, "B");
		Hashtable<Integer, String> ht4 = new Hashtable<>(temp);
		System.out.println("Constructor 4: From another map -> " + ht4);

		// Demonstrating Methods
		Hashtable<Integer, String> ht = new Hashtable<>();

		// 1. put(K,V)
		ht.put(1, "Apple");
		ht.put(2, "Banana");
		ht.put(3, "Cherry");
		System.out.println("1. put(): " + ht);

		// 2. get(Object key)
		System.out.println("2. get(2): " + ht.get(2));

		// 3. remove(Object key)
		ht.remove(3);
		System.out.println("3. remove(key): " + ht);

		// 4. containsKey(Object key)
		System.out.println("4. containsKey(1): " + ht.containsKey(1));

		// 5. containsValue(Object value)
		System.out.println("5. containsValue(\"Banana\"): " + ht.containsValue("Banana"));

		// 6. size()
		System.out.println("6. size(): " + ht.size());

		// 7. isEmpty()
		System.out.println("7. isEmpty(): " + ht.isEmpty());

		// 8. keySet()
		System.out.println("8. keySet(): " + ht.keySet());

		// 9. values()
		System.out.println("9. values(): " + ht.values());

		// 10. entrySet()
		System.out.println("10. entrySet(): " + ht.entrySet());

		// 11. putIfAbsent(K,V)
		ht.putIfAbsent(4, "Mango");
		System.out.println("11. putIfAbsent(): " + ht);

		// 12. replace(K,V)
		ht.replace(2, "Orange");
		System.out.println("12. replace(key,value): " + ht);

		// 13. replace(K, oldValue, newValue)
		ht.replace(2, "Orange", "Guava");
		System.out.println("13. replace(key,old,new): " + ht);

		// 14. clone()
		Hashtable<Integer, String> cloneHt = (Hashtable<Integer, String>) ht.clone();
		System.out.println("14. clone(): " + cloneHt);

		// 15. equals(Object o)
		System.out.println("15. equals(cloneHt): " + ht.equals(cloneHt));

		// Iteration using Enumeration
		System.out.println("\nIterating Hashtable using Enumeration:");
		Enumeration<Integer> keys = ht.keys();
		while (keys.hasMoreElements()) {
			Integer k = keys.nextElement();
			System.out.println("Key: " + k + ", Value: " + ht.get(k));
		}
	}
}