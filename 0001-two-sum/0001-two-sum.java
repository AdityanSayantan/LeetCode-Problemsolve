class Solution {
    // check if two numbers sum to target using hashing 
    public int[] twoSum(int[] nums, int target) {
        // create a stack  to store the value with idx
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // complement in the sense the resultant element after subtract
            int complement = target - nums[i];
            
            // Check if complement found , return indices
            if (map.containsKey(complement)) {
                // map.get(complement) means in which index the resultant element is situated..
                return new int[]{map.get(complement), i};
            }
            
            // Store the current element and index
            map.put(nums[i], i);
        }
        
        //if No pair found
        return new int[]{-1, -1};
    }
}