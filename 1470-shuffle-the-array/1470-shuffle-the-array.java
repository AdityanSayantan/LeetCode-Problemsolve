class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result  = new int[2*n];
        for(int i=0;i<n;i++){
            result[2*i] = nums[i];
            result[2*i+1] = nums[n+i];
        }
        return result;
    }
}


// nums = [2, 5, 1, 3, 4, 7]
// n = 3
// result = new int[6] // creates [0, 0, 0, 0, 0, 0]
// result[2 * i] = nums[i];
// // 2 * 0 = 0
// // result[0] = nums[0] = 2
// // result becomes: [2, 0, 0, 0, 0, 0]

// result[2 * i + 1] = nums[n + i];
// // 2 * 0 + 1 = 1
// // n + i = 3 + 0 = 3
// // result[1] = nums[3] = 3
// // result becomes: [2, 3, 0, 0, 0, 0]
// Remaining as it is
