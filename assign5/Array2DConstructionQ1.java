package in.ineuron.assign5;

import java.util.Arrays;

public class Array2DConstructionQ1 {
	 public static int[][] construct2DArray(int[] original, int m, int n) {
	        int len = original.length;
	        if (len != m * n) {
	            // If the number of elements in original is not equal to m * n, it is impossible
	            return new int[0][0];
	        }

	        int[][] result = new int[m][n];
	        for (int i = 0; i < len; i++) {
	            int row = i / n;  // Determine the row for the current element
	            int col = i % n;  // Determine the column for the current element
	            result[row][col] = original[i];
	        }

	        return result;
	    }

	public static void main(String[] args) {
		// Question 1
		int[] original = {1, 2, 3, 4, 5, 6};
        int m = 2;
        int n = 3;
        int[][] result = construct2DArray(original, m, n);
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }

	}

}
