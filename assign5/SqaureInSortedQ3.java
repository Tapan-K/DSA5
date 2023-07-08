package in.ineuron.assign5;

import java.util.Arrays;

public class SqaureInSortedQ3 {
	public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int idx = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[idx] = leftSquare;
                left++;
            } else {
                result[idx] = rightSquare;
                right--;
            }

            idx--;
        }

        return result;
    }

	public static void main(String[] args) {
		// Question 3
		int[] nums = {-4, -1, 0, 3, 10};
        int[] squaredArray = sortedSquares(nums);
        System.out.println("Sorted Squares: " + Arrays.toString(squaredArray));

	}

}
