class Solution {
    public int repeatedNTimes(int[] nums) {
       //Create HashSet to track numbers we've seem
       Set<Integer> seen = new HashSet<>();

  // Iterate through each number in the array     
       for(int num: nums ){
          // If we've already seen this number before, 
            // it must be the repeated one (since only one number repeats)
            if(seen.contains(num)){

                return num;// returned the repeated number
            }
            // Otherwise, add this number to our set of seen numbers
            seen.add(num);
       }
        // This line should never be reached given the problem constraints,
        // but we include it for completeness
       return -1;
    
    }
}