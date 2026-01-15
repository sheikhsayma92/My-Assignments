package Assignment03;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Que2 {
	public static void main(String[] args) {
		// Demonstrating Constructors

		// 1. Default constructor
		Vector<String> v1 = new Vector<>();
		System.out.println("Constructor 1: Default -> " + v1);

		// 2. Constructor with initial capacity
		Vector<String> v2 = new Vector<>(5);
		System.out.println("Constructor 2: With capacity 5 -> " + v2);

		// 3. Constructor with capacity and capacityIncrement
		Vector<String> v3 = new Vector<>(3, 2);
		System.out.println("Constructor 3: With capacity 3 and increment 2 -> " + v3);

		// 4. Constructor with another collection
		List<String> temp = Arrays.asList("A", "B", "C");
		Vector<String> v4 = new Vector<>(temp);
		System.out.println("Constructor 4: From another collection -> " + v4);

		// Demonstrating Methods
		Vector<String> vec = new Vector<>();

		// 1. add(E e)
		vec.add("Apple");
		vec.add("Banana");
		vec.add("Cherry");
		System.out.println("1. add(E): " + vec);

		// 2. add(int index, E element)
		vec.add(1, "Mango");
		System.out.println("2. add(index, element): " + vec);

		// 3. get(int index)
		System.out.println("3. get(2): " + vec.get(2));

		// 4. set(int index, E element)
		vec.set(2, "Orange");
		System.out.println("4. set(): " + vec);

		// 5. remove(int index)
		vec.remove(1);
		System.out.println("5. remove(index): " + vec);

		// 6. remove(Object o)
		vec.remove("Cherry");
		System.out.println("6. remove(object): " + vec);

		// 7. size()
		System.out.println("7. size(): " + vec.size());

		// 8. contains(Object o)
		System.out.println("8. contains(\"Apple\"): " + vec.contains("Apple"));

		// 9. isEmpty()
		System.out.println("9. isEmpty(): " + vec.isEmpty());

		// 10. indexOf(Object o)
		System.out.println("10. indexOf(\"Apple\"): " + vec.indexOf("Apple"));

		// 11. lastIndexOf(Object o)
		vec.add("Apple");
		System.out.println("11. lastIndexOf(\"Apple\"): " + vec.lastIndexOf("Apple"));

		// 12. clear()
		Vector<String> vec2 = new Vector<>(Arrays.asList("X", "Y", "Z"));
		System.out.println("Before clear(): " + vec2);
		vec2.clear();
		System.out.println("12. clear(): " + vec2);

		// 13. clone()
		Vector<String> cloneVec = (Vector<String>) vec.clone();
		System.out.println("13. clone(): " + cloneVec);

		// 14. capacity()
		System.out.println("14. capacity(): " + vec.capacity());

		// 15. firstElement() and lastElement()
		System.out.println("15. firstElement(): " + vec.firstElement() + ", lastElement(): " + vec.lastElement());

		// Iteration
		System.out.println("\nIterating Vector:");
		for (String s : vec) {
			System.out.println(s);
		}
	}
}