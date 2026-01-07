package Assignment03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		// Demonstrating Constructors

		// 1. Default constructor
		ArrayList<String> list1 = new ArrayList<>();
		System.out.println("Constructor 1: Default -> " + list1);

		// 2. Constructor with initial capacity
		ArrayList<String> list2 = new ArrayList<>(5);
		System.out.println("Constructor 2: With capacity 5 -> " + list2);

		// 3. Constructor with another collection
		List<String> temp = Arrays.asList("A", "B", "C");
		ArrayList<String> list3 = new ArrayList<>(temp);
		System.out.println("Constructor 3: From another collection -> " + list3);

		// Demonstrating Methods
		ArrayList<String> arr = new ArrayList<>();

		// 1. add(E e)
		arr.add("Apple");
		arr.add("Banana");
		arr.add("Cherry");
		System.out.println("1. add(E): " + arr);

		// 2. add(int index, E element)
		arr.add(1, "Mango");
		System.out.println("2. add(index, element): " + arr);

		// 3. get(int index)
		System.out.println("3. get(2): " + arr.get(2));

		// 4. set(int index, E element)
		arr.set(2, "Orange");
		System.out.println("4. set(): " + arr);

		// 5. remove(int index)
		arr.remove(1);
		System.out.println("5. remove(index): " + arr);

		// 6. remove(Object o)
		arr.remove("Cherry");
		System.out.println("6. remove(object): " + arr);

		// 7. size()
		System.out.println("7. size(): " + arr.size());

		// 8. contains(Object o)
		System.out.println("8. contains(\"Apple\"): " + arr.contains("Apple"));

		// 9. isEmpty()
		System.out.println("9. isEmpty(): " + arr.isEmpty());

		// 10. indexOf(Object o)
		System.out.println("10. indexOf(\"Apple\"): " + arr.indexOf("Apple"));

		// 11. lastIndexOf(Object o)
		arr.add("Apple");
		System.out.println("11. lastIndexOf(\"Apple\"): " + arr.lastIndexOf("Apple"));

		// 12. clear()
		ArrayList<String> arr2 = new ArrayList<>(Arrays.asList("X", "Y", "Z"));
		System.out.println("Before clear(): " + arr2);
		arr2.clear();
		System.out.println("12. clear(): " + arr2);

		// 13. clone()
		ArrayList<String> cloneList = (ArrayList<String>) arr.clone();
		System.out.println("13. clone(): " + cloneList);

		// 14. ensureCapacity(int minCapacity)
		arr.ensureCapacity(50);
		System.out.println("14. ensureCapacity(50) called (capacity increased internally)");

		// 15. trimToSize()
		arr.trimToSize();
		System.out.println("15. trimToSize() called (capacity reduced to current size)");

		// Iteration
		System.out.println("\nIterating ArrayList:");
		for (String s : arr) {
			System.out.println(s);
		}
	}
}