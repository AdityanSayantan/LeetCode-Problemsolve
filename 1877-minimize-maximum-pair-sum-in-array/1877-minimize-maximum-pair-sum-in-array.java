class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        
        int n = nums.length;
        int maxSum = 0;
        
        // Pair the smallest with the largest, second smallest with second largest, etc.
        for (int i = 0; i < n/2; i++) {
            // Pair nums[i] (small elements) with nums[n-1-i] (large elements)
            int pairSum = nums[i] + nums[n - 1 - i];
            
            // Keep track of the maximum pair sum
            if (pairSum > maxSum) {
                maxSum = pairSum;
            }
        }
        
        return maxSum;
    }
}