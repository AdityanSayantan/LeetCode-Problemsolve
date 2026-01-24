class Solution {
    public int minPairSum(int[] nums) {
        int maxVal = 0;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }
        
        int[] count = new int[maxVal + 1];
        for (int num : nums) {
            count[num]++;
        }
        
        // Reconstruct sorted array
        int idx = 0;
        for (int i = 0; i <= maxVal; i++) {
            while (count[i]-- > 0) {
                nums[idx++] = i;
            }
        }
        
        // Two-pointer approach for pairing
        int maxPairSum = 0;
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            maxPairSum = Math.max(maxPairSum, nums[left] + nums[right]);
            left++;
            right--;
        }
        
        return maxPairSum;
    }
}