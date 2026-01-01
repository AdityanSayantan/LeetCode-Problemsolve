class Solution {
    public int[] plusOne(int[] digits) {
      int n = digits.length;
      // start from last of the array
        for (int i = n - 1; i >= 0; i--) {
            // if digit < 9
            if (digits[i] < 9) {
                // Increment it
                digits[i]++;
                // Immediatly return it
                return digits;
            }
            // Otherwise set the digit to 0
            digits[i] = 0;
            // Continue to the next digit(carry over)
            // ex- [1,2,9] -> [1,2,0] -> [1,3,0]-final
        }
// Otherwise if the string is [9,9,9]->
// take new array with [size+1] 
       int[] result = new int[n + 1];
       // first should be set to 1
       result[0] = 1;
       // return result , remaining initially 0 -> [1,0,0,0]
       return result;
    }
}