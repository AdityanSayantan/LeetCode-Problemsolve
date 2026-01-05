class Solution {
    public long maxMatrixSum(int[][] matrix) {
         int minabs = Integer.MAX_VALUE; // To store the smallest absolute value in the matrix
        int lcount = 0; // To count the number of negative values
        long sum = 0; // To store the sum of absolute values
        int n = matrix.length; // Size of the matrix (n x n)

        // Traverse the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = matrix[i][j];
                sum += Math.abs(val); // Add absolute value to the sum
                if (val < 0) {
                    lcount++; // Increment count of negative values
                }
                minabs = Math.min(minabs, Math.abs(val)); // Update smallest absolute value
            }
        }

        // If the count of negative values is odd, subtract twice the smallest absolute value
        if (lcount % 2 == 1) {
            sum -= 2 * minabs;
        }

        return sum; // Return the maximum possible sum
    }
}