class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length*2];
        for(int i=0;i<2;i++){
            System.arraycopy(nums, 0, result,  i*nums.length, nums.length);
        }
        return result;
    }
   
}


// System.arraycopy(arr, 0, result, i * arr.length, arr.length);
//System.arraycopy(sourceArray, sourceStartIndex, destinationArray, destinationStartIndex,numberOfElementsToCopy);
