class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int n = nums.length; // Count occurrences of each number 
        int[] count = new int[n + 1];
        for (int num : nums) {
            count[num]++;
        } // Find duplicate (appears twice) and missing (appears zero times) 
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                result[0] = i; // duplicate 
            }
            if (count[i] == 0) {
                result[1] = i; // missing 
            }
        }
        return result;
    }
}