class Solution {
    public int minimumCost(int[] nums) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i] < first){
                second = first; // old first become 2nd
                first = nums[i]; // new smallest
            }
            else if(nums[i] < second){
                second = nums[i]; // new 2nd Smallest
            }
        }
        return nums[0] + first + second;
    }
}