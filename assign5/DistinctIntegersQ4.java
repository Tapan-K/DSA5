package in.ineuron.assign5;

import java.util.*;

public class DistinctIntegersQ4 {
	public static List<List<Integer>> findDistinctIntegers(int[] nums1, int[] nums2) {
		List<Integer> distinctNums1 = new ArrayList<>();
		List<Integer> distinctNums2 = new ArrayList<>();

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		for (int num : nums1) {
			set1.add(num);
		}

		for (int num : nums2) {
			set2.add(num);
		}

		for (int num : set1) {
			if (!set2.contains(num)) {
				distinctNums1.add(num);
			}
		}

		for (int num : set2) {
			if (!set1.contains(num)) {
				distinctNums2.add(num);
			}
		}

		List<List<Integer>> answer = new ArrayList<>();
		answer.add(distinctNums1);
		answer.add(distinctNums2);

		return answer;
	}

	public static void main(String[] args) {
		// Q.4
		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 2, 4, 6 };

		List<List<Integer>> distinctIntegers = findDistinctIntegers(nums1, nums2);

		System.out.println("Distinct integers in nums1 not present in nums2: " + distinctIntegers.get(0));
		System.out.println("Distinct integers in nums2 not present in nums1: " + distinctIntegers.get(1));

	}

}
