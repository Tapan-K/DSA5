package in.ineuron.assign5;

public class MinArrayRotationQ7 {
	public static int findMin(int[] nums) {
		int left = 0;
		int right = nums.length - 1;

		while (left < right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] > nums[right]) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}

		return nums[left];
	}

	public static void main(String[] args) {
		// Question 7
		int[] nums = { 3, 4, 5, 1, 2 };
		int minElement = findMin(nums);

		System.out.println("Minimum element: " + minElement);

	}

}
