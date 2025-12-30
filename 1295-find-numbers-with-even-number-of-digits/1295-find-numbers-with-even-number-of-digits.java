class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums){
            int temp = num;
            int digitCount = 0;
            while(temp != 0){
                digitCount++;
                temp = temp/10;
            }
            if(digitCount % 2 ==0){
            count++;
        }
        }
        
        return count;
    

    }
}