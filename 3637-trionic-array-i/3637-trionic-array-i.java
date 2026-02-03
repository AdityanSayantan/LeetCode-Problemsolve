class Solution {
    public boolean isTrionic(int[] nums) {
      int n = nums.length;
    
    // Phase 1: Strictly increasing
    int i = 0;
    while(i+1 < n && nums[i] < nums[i+1]) i++;
    if(i == 0) return false;  // Must have at least 1 increase
    
    // Phase 2: Strictly decreasing  
    int mid = i;  // Save peak position
    while(i+1 < n && nums[i] > nums[i+1]) i++;
    if(i == mid) return false;  // Must have at least 1 decrease
    
    // Phase 3: Strictly increasing again
    int valley = i;  // Save valley position  
    while(i+1 < n && nums[i] < nums[i+1]) i++;
    if(i == valley) return false;  // Must have at least 1 increase
    
    // Check if we reached the end
    return i == n-1;
  
    }
}