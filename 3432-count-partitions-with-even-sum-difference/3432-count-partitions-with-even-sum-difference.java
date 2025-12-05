class Solution {
    public int countPartitions(int[] nums) {
       int count = 0;
       int totalsum = 0;
       // take totalSum
       for(int i=0;i<nums.length;i++){
        totalsum += nums[i];
       }
       // to partition the num as per the explanation
         int PreSum = 0;
       for(int i=0;i<nums.length-1;i++){
        // take one i/p at a time
         PreSum += nums[i];
         // subtract from the totalsum 
         int PostSum = totalsum-PreSum; // now array look [10] [10, 3, 7, 6] for 1st iterate
        // 2nd iterate = [10, 10] [3,7,6]
        // now sum difference from both
         int different = Math.abs(PreSum - PostSum);
         // Check even or not
         if(different % 2 == 0){
            count++;
         }

       } 
       return count;
    }
}