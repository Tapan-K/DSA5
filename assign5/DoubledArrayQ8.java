package in.ineuron.assign5;

import java.util.*;

public class DoubledArrayQ8 {
	public static int[] findOriginal(int[] changed) {
		Map<Integer, Integer> countMap = new HashMap<>();

		// Counting the occurrences of each element in the changed array
		for (int num : changed) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}

		List<Integer> original = new ArrayList<>();

		// Traversing the changed array to find the original elements
		for (int num : changed) {
			if (countMap.containsKey(num * 2)) {

				original.add(num);

				countMap.put(num * 2, countMap.get(num * 2) - 1);

				if (countMap.get(num * 2) == 0) {
					countMap.remove(num * 2);
				}
			} else {

				return new int[0];
			}
		}

		// Convert the original list to an array
		int[] originalArray = new int[original.size()];
		for (int i = 0; i < original.size(); i++) {
			originalArray[i] = original.get(i);
		}

		return originalArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] changed = { 1, 3, 4, 2, 6, 8 };
		int[] original = findOriginal(changed);

		System.out.println("Original array: " + java.util.Arrays.toString(original));

	}

}
